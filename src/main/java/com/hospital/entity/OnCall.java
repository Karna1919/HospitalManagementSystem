package com.hospital.entity;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.MapsId;
@Entity
public class OnCall {

	@EmbeddedId
	private OnCallId id;

	@ManyToOne
	@MapsId("nurse")
	@JoinColumn(name = "nurse")
	private Nurse nurse;

}
