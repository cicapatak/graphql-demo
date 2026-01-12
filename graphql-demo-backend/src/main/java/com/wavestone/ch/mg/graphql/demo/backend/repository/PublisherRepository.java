package com.wavestone.ch.mg.graphql.demo.backend.repository;

import com.wavestone.ch.mg.graphql.demo.backend.entity.Publisher;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PublisherRepository extends JpaRepository<Publisher, Long> {

}

