package com.example.springbootgithubaction.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {

    @GetMapping("/users")
    public List<String> getUserName(){
        return List.of("one","two","three","four","five");
    }
}
