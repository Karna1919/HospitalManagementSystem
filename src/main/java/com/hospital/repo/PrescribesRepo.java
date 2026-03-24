package com.hospital.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hospital.entity.Prescribes;
import com.hospital.entity.PrescribesId;

public interface PrescribesRepo extends JpaRepository<Prescribes, PrescribesId>
{

}
