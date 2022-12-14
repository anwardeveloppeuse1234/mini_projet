package com.example.series.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.example.series.entities.Genre;
@RepositoryRestResource(path = "gen")
@CrossOrigin("*") //pour autoriser angular 

public interface GenreRepository extends JpaRepository<Genre, Long> {

}
