package com.example.employee_api.patient.repository;

import com.example.employee_api.patient.model.entity.Patient;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PatientRepository extends JpaRepository<Patient, Long> {
}