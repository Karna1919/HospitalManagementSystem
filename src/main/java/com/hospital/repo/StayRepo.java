package com.hospital.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hospital.entity.Stay;

public interface StayRepo extends JpaRepository<Stay, Integer>{

}
