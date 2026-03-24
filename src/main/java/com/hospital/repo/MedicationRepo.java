package com.hospital.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hospital.entity.Medication;

public interface MedicationRepo extends JpaRepository<Medication, Integer> {

}
