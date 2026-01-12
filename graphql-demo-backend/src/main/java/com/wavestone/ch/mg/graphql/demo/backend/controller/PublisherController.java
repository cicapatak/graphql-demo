package com.wavestone.ch.mg.graphql.demo.backend.controller;

import com.wavestone.ch.mg.graphql.demo.backend.entity.Publisher;
import com.wavestone.ch.mg.graphql.demo.backend.repository.PublisherRepository;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

import java.util.List;

@Controller
public class PublisherController {

    private final PublisherRepository publisherRepository;

    public PublisherController(PublisherRepository publisherRepository) {
        this.publisherRepository = publisherRepository;
    }

    @QueryMapping
    public Publisher publisherById(@Argument Long id) {
        return publisherRepository.findById(id).orElse(null);
    }

    @QueryMapping
    public List<Publisher> publishers() {
        return publisherRepository.findAll();
    }
}

