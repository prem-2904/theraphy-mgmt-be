package com.prem.therapy_mgmt_be.services;

import com.prem.therapy_mgmt_be.models.Therapists;
import com.prem.therapy_mgmt_be.repository.TherapistsRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TherapistService {

    private final TherapistsRepository therapistsRepository;

    public TherapistService(TherapistsRepository therapistsRepository) {
        this.therapistsRepository = therapistsRepository;
    }

    public List<Therapists> getAllTherapists(){
        return therapistsRepository.findAll();
    }

    public Therapists createTherapists(Therapists therapists){
        return therapistsRepository.save(therapists);
    }
}
