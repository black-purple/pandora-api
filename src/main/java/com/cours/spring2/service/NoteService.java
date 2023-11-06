package com.cours.spring2.service;

import com.cours.spring2.model.Note;
import com.cours.spring2.repo.NoteRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

@Service
public class NoteService {
    private final NoteRepo notes;

    @Autowired
    public NoteService(NoteRepo notes) {
        this.notes = notes;
    }

    public List<Note> getNotes() {
        return notes.findAll();
    }

    public Optional<Note> getNote(int id) {
        return  notes.findById(id);
    }

    public Note addNote(Note note) {
         return notes.save(note);
    }

    public Optional<String> deleteNote(int id) {
        notes.deleteById(id);
        return (notes.findById(id).isEmpty() ? "Deleted" : "Not Deleted").describeConstable();
    }

    public Note updateNote(Note newNote, int id) {
        Note note = notes.getReferenceById(id);
        note.setTitle(newNote.getTitle());
        note.setContent(newNote.getContent());
        return notes.save(note);
    }

    public Note lockNote(int id) {
        Note note = notes.getReferenceById(id);
        note.setLocked(!note.isLocked());
        return notes.save(note);
    }

}
