package com.prem.therapy_mgmt_be.controllers;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.prem.therapy_mgmt_be.models.Therapists;
import com.prem.therapy_mgmt_be.services.TherapistService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/therapists")
public class TherapistsController {
    private final TherapistService therapistService;


    public TherapistsController(TherapistService therapistService) {
        this.therapistService = therapistService;
    }

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public ResponseEntity<List<Therapists>> getAllTherapists(){
        List<Therapists> therapistList = therapistService.getAllTherapists();
        return ResponseEntity.ok(therapistList);
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void createTherapists(@RequestBody Therapists therapists){
        try {
            therapistService.createTherapists(therapists);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
