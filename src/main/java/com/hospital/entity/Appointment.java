package com.hospital.entity;

import java.time.LocalDateTime;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
@Entity
public class Appointment {

	@Id
	private Integer appointmentId;

	@ManyToOne
	@JoinColumn(name = "patient")
	private Patient patient;

	@ManyToOne
	@JoinColumn(name = "prepnurse")
	private Nurse nurse;

	@ManyToOne
	@JoinColumn(name = "physician")
	private Physician physician;

	private LocalDateTime starto;
	private LocalDateTime endo;

	private String examinationRoom;

}
