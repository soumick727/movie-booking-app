package com.example.moviebooking.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.moviebooking.entity.Screen;

public interface ScreenRepository extends JpaRepository<Screen, Long> {

}
