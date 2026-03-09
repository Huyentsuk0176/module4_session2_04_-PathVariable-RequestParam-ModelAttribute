package com.example.employee_api.doctor.repository;

import com.example.employee_api.doctor.model.entity.Doctor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DoctorRepository extends JpaRepository<Doctor, Long> {
}