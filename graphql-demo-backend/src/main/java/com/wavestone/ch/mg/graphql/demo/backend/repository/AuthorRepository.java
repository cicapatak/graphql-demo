package com.wavestone.ch.mg.graphql.demo.backend.repository;

import com.wavestone.ch.mg.graphql.demo.backend.entity.Author;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AuthorRepository extends JpaRepository<Author, Long> {

}

