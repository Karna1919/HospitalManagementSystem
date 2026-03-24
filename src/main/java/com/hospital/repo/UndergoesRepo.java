package com.hospital.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hospital.entity.Undergoes;
import com.hospital.entity.UndergoesId;

public interface UndergoesRepo extends JpaRepository<Undergoes, UndergoesId>{

}
