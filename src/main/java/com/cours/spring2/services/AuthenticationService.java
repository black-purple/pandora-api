package com.cours.spring2.services;

import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.cours.spring2.http.request.SignUpRequest;
import com.cours.spring2.http.request.SigninRequest;
import com.cours.spring2.http.response.JwtAuthenticationResponse;
import com.cours.spring2.model.Role;
import com.cours.spring2.model.User;
import com.cours.spring2.repositories.UserRepository;


import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class AuthenticationService {
    private final UserRepository userRepository;
    private final PasswordEncoder passwordEncoder;
    private final JwtService jwtService;
    private final AuthenticationManager authenticationManager;

    public JwtAuthenticationResponse signup(SignUpRequest request) {
        //TODO create the token based on the user in the request
    }

    public JwtAuthenticationResponse signin(SigninRequest request) {
        //TODO create the token based on the user in the Database
    }
}
