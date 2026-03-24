package com.hospital.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hospital.entity.Appointment;

public interface AppointmentRepo extends JpaRepository<Appointment, Integer>{

}
