package com.hospital.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hospital.entity.Procedures;

public interface ProceduresRepo extends JpaRepository<Procedures, Integer>{

}
