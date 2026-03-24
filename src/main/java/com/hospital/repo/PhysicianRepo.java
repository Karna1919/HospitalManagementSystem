package com.hospital.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hospital.entity.Physician;

public interface PhysicianRepo extends JpaRepository<Physician, Integer>{

}
