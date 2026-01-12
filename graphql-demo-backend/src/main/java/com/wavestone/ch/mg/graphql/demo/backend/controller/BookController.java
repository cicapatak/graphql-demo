package com.wavestone.ch.mg.graphql.demo.backend.controller;

import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/books")
public class BookController {

    @QueryMapping("bookById")
    public Object getBookById(@Argument Long id) {
        return null;
    }
}
