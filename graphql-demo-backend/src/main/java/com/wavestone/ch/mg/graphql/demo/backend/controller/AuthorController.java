package com.wavestone.ch.mg.graphql.demo.backend.controller;

import com.wavestone.ch.mg.graphql.demo.backend.entity.Author;
import com.wavestone.ch.mg.graphql.demo.backend.repository.AuthorRepository;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

import java.util.List;

@Controller
public class AuthorController {

    private final AuthorRepository authorRepository;

    public AuthorController(AuthorRepository authorRepository) {
        this.authorRepository = authorRepository;
    }

    @QueryMapping
    public Author authorById(@Argument Long id) {
        return authorRepository.findById(id).orElse(null);
    }

    @QueryMapping
    public List<Author> authors() {
        return authorRepository.findAll();
    }
}

