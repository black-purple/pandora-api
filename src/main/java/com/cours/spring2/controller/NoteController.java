package com.cours.spring2.controller;

import com.cours.spring2.model.Note;
import com.cours.spring2.services.NoteService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/v1/notes")
@RequiredArgsConstructor
public class NoteController {
    private final NoteService service;

    @GetMapping
    private ResponseEntity<List<Note>> getNotes() {
        return  ResponseEntity.status(HttpStatus.OK).body(service.getNotes());
    }

    @GetMapping("/{id}")
    private ResponseEntity<Optional<Note>> getNotes(@PathVariable int id) {
        if (service.getNote(id).isPresent()) return ResponseEntity.ok(service.getNote(id));
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body(null);
    }
    @PostMapping
    private ResponseEntity<Note> addNote(@RequestBody Note note) {
        return ResponseEntity.status(HttpStatus.CREATED).body(service.addNote(note));
    }

    @PatchMapping("/{id}")
    private ResponseEntity<Note> updateNote(@PathVariable int id, @RequestBody Note note) {
        return ResponseEntity.status(HttpStatus.OK).body(service.updateNote(note, id));
    }

    @PutMapping("/{id}")
    private ResponseEntity<Note> lockNote(@PathVariable int id) {
        return ResponseEntity.status(HttpStatus.OK).body(service.lockNote(id));
    }

    @DeleteMapping("/{id}")
    private ResponseEntity<Optional<String>> deleteNote(@PathVariable int id) {
        return ResponseEntity.status(204).body(service.deleteNote(id));
    }

}
