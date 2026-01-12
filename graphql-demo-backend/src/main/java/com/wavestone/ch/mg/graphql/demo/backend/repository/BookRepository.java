package com.wavestone.ch.mg.graphql.demo.backend.repository;

import com.wavestone.ch.mg.graphql.demo.backend.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book, Long> {

}
