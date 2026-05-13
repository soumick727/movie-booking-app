package com.example.moviebooking.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.moviebooking.entity.Movie;

public interface MovieRepository extends JpaRepository<Movie, Long> {

}
