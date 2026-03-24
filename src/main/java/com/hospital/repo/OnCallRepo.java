package com.hospital.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hospital.entity.OnCall;
import com.hospital.entity.OnCallId;

public interface OnCallRepo extends JpaRepository<OnCall, OnCallId>
{

}
