package com.hospital.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hospital.entity.Nurse;

public interface NurseRepo extends JpaRepository<Nurse, Integer>{

}
