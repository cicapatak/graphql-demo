package com.wavestone.ch.mg.graphql.demo.backend.controller;

import com.wavestone.ch.mg.graphql.demo.backend.entity.Book;
import com.wavestone.ch.mg.graphql.demo.backend.repository.BookRepository;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

import java.util.List;

@Controller
public class BookController {

    private final BookRepository bookRepository;

    public BookController(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    @QueryMapping
    public Book bookById(@Argument Long id) {
        return bookRepository.findById(id).orElse(null);
    }

    @QueryMapping
    public List<Book> books() {
        return bookRepository.findAll();
    }
}
