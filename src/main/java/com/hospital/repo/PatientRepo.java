package com.hospital.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hospital.entity.Patient;

public interface PatientRepo extends JpaRepository<Patient, Integer>{

}
