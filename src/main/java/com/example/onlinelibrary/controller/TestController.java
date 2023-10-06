package com.example.onlinelibrary.controller;

import com.example.onlinelibrary.model.Author;
import com.example.onlinelibrary.service.AuthorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class TestController {

    @Autowired
    private AuthorService authorService;

    @GetMapping("/test")
    public String test() {
        return "SUCCESS";
    }

    @GetMapping("/authors")
    public List<Author> getAll() {
        return authorService.findAll();
    }
}
