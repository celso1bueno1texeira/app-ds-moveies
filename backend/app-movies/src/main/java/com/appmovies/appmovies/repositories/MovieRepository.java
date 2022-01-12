package com.appmovies.appmovies.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.appmovies.appmovies.entities.Movie;

public interface MovieRepository extends JpaRepository<Movie, Long> {

}
