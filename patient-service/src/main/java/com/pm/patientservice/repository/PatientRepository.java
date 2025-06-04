package com.pm.patientservice.repository;

import com.pm.patientservice.model.Patient;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface PatientRepository extends JpaRepository<Patient, UUID> {

    // this is a method that returns boolean on whether
    // the passed email exists in any data or not
    boolean existsByEmail(String email);
    boolean existsByEmailAndIdNot(String email, UUID id);
}
