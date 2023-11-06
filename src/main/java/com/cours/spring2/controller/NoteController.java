package com.cours.spring2.controller;

import com.cours.spring2.model.Note;
import com.cours.spring2.service.NoteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/notes")
public class NoteController {
    private final NoteService service;

    @Autowired
    public NoteController(NoteService service) {
        this.service = service;
    }

    @GetMapping
    private List<Note> getNotes() {
        return service.getNotes();
    }

    @GetMapping("/{id}")
    private Optional<Note> getNotes(@PathVariable int id) {
        return service.getNote(id);
    }
    @PostMapping
    private Note addNote(@RequestBody Note note) {
        return service.addNote(note);
    }

    @PatchMapping("/{id}")
    private Note updateNote(@PathVariable int id, @RequestBody Note note) {
        return service.updateNote(note, id);
    }

    @PutMapping("/{id}")
    private Note lockNote(@PathVariable int id) {
        return service.lockNote(id);
    }

    @DeleteMapping("/{id}")
    private Optional<String> deleteNote(@PathVariable int id) {
        return service.deleteNote(id);
    }

}
