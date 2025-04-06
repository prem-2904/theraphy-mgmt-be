package com.prem.therapy_mgmt_be.repository;

import com.prem.therapy_mgmt_be.models.Therapists;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TherapistsRepository extends JpaRepository<Therapists, Integer> {
}
