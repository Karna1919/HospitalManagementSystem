package com.hospital.entity;

import java.time.LocalDateTime;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.MapsId;

public class TrainedIn {

	@EmbeddedId
	    private TrainedInId  id;

	private LocalDateTime certificationDate;
	private LocalDateTime certificationExpires;

	@ManyToOne
	@MapsId("physician")
	@JoinColumn(name = "physician")
	private Physician physician;

	@ManyToOne
	@MapsId("treatment")
	@JoinColumn(name = "treatment")
	private Procedures procedure;

}
