package com.example.moviebooking.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.moviebooking.entity.Inox;
import com.example.moviebooking.repository.InoxRepository;

import jakarta.transaction.Transactional;

@Service
public class INOXService {

    @Autowired
    private InoxRepository inoxRepository;

    // Save INOX Booking
    @Transactional
    public Inox saveInox(Inox inox) {
        return inoxRepository.save(inox);
    }

    // Get All INOX
    public List<Inox> getAllInox() {
        return inoxRepository.findAll();
    }
}