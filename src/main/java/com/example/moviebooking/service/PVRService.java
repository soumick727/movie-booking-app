package com.example.moviebooking.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.moviebooking.entity.PVR;
import com.example.moviebooking.repository.PVRRepository;

import jakarta.transaction.Transactional;

@Service
public class PVRService {

    @Autowired
    private PVRRepository pvrRepository;

    // Save PVR Booking
    @Transactional
    public PVR savePVR(PVR pvr) {
        return pvrRepository.save(pvr);
    }

    // Get All PVR
    public List<PVR> getAllPVR() {
        return pvrRepository.findAll();
    }
}