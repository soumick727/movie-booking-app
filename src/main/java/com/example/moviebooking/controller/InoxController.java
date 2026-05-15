package com.example.moviebooking.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.moviebooking.entity.Inox;
import com.example.moviebooking.service.INOXService;

@RestController
@RequestMapping("/inox")
public class InoxController {

    @Autowired
    private INOXService inoxService;

    // Save INOX Booking
    @PostMapping("/book")
    public Inox saveInox(@RequestBody Inox inox) {
        return inoxService.saveInox(inox);
    }

    // Get All INOX
    @GetMapping
    public List<Inox> getAllInox() {
        return inoxService.getAllInox();
    }
}