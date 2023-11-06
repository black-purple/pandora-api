package com.cours.spring2.service;

import com.cours.spring2.model.User;
import com.cours.spring2.repo.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    private final UserRepo users;

    @Autowired
    public UserService(UserRepo users) {
        this.users = users;
    }
}
