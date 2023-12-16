package com.cours.spring2.controller.Auth;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.RequiredArgsConstructor;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/api/v1/hello_world")
@RequiredArgsConstructor
public class AuthorizationController {
    @GetMapping()
    public ResponseEntity<Map<String, String>> sayHello() {
        Map<String, String> myMap = new HashMap<>();
        myMap.put("wuuut", "hello world finaaaally XD");
        return  ResponseEntity.ok(myMap);
    }
}
