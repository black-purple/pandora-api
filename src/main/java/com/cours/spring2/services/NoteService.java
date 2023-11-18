package com.cours.spring2.services;

import com.cours.spring2.repositories.NoteRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class NoteService {
    private final NoteRepo notes;

    @Autowired
    public NoteService(NoteRepo notes) {
        this.notes = notes;
    }

    public List<com.cours.spring2.model.Note> getNotes() {
        return notes.findAll();
    }

    public Optional<com.cours.spring2.model.Note> getNote(int id) {
        return  notes.findById(id);
    }

    public com.cours.spring2.model.Note addNote(com.cours.spring2.model.Note note) {
         return notes.save(note);
    }

    public Optional<String> deleteNote(int id) {
        notes.deleteById(id);
        return (notes.findById(id).isEmpty() ? "Deleted" : "Not Deleted").describeConstable();
    }

    public com.cours.spring2.model.Note updateNote(com.cours.spring2.model.Note newNote, int id) {
        com.cours.spring2.model.Note note = notes.getReferenceById(id);
        note.setTitle(newNote.getTitle());
        note.setContent(newNote.getContent());
        return notes.save(note);
    }

    public com.cours.spring2.model.Note lockNote(int id) {
        com.cours.spring2.model.Note note = notes.getReferenceById(id);
        note.setLocked(!note.isLocked());
        return notes.save(note);
    }

}
