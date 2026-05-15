package com.example.moviebooking.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.moviebooking.entity.PVR;
import com.example.moviebooking.service.PVRService;

@RestController
@RequestMapping("/pvr")
public class PVRController {

    @Autowired
    private PVRService pvrService;

    // Save PVR Booking
    @PostMapping("/book")
    public PVR savePVR(@RequestBody PVR pvr) {
        return pvrService.savePVR(pvr);
    }

    // Get All PVR
    @GetMapping
    public List<PVR> getAllPVR() {
        return pvrService.getAllPVR();
    }
}