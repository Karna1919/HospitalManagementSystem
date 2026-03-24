package com.hospital.entity;

import java.time.LocalDateTime;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
@Entity
public class Stay {

	@Id
	private Integer stayId;

	@ManyToOne
	@JoinColumn(name = "patient")
	private Patient patient;

	@ManyToOne
	@JoinColumn(name = "room")
	private Room room;

	private LocalDateTime stayStart;
	private LocalDateTime stayEnd;

}
