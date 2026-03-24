package com.hospital.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hospital.entity.TrainedIn;
import com.hospital.entity.TrainedInId;

public interface TrainedInRepo extends JpaRepository<TrainedIn,TrainedInId>{

}
