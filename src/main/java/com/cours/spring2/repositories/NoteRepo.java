package com.cours.spring2.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NoteRepo extends JpaRepository<com.cours.spring2.model.Note, Integer> {
}
