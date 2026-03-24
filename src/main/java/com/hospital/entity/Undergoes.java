package com.hospital.entity;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.MapsId;

@Entity
public class Undergoes {

	@EmbeddedId
	private UndergoesId id;

	@ManyToOne
	@MapsId("patient")
	@JoinColumn(name = "patient")
	private Patient patient;

	@ManyToOne
	@MapsId("procedures")
	@JoinColumn(name = "procedures")
	private Procedures procedures;

	@ManyToOne
	@MapsId("stay")
	@JoinColumn(name = "stay")
	private Stay stay;

	@ManyToOne
	@JoinColumn(name = "physician")
	private Physician physician;

	@ManyToOne
	@JoinColumn(name = "assistingnurse")
	private Nurse nurse;

}
