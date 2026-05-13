package com.example.moviebooking.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.moviebooking.entity.PVR;

public interface PVRRepository extends JpaRepository<PVR, Long> {

}
