package com.hospital.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinColumns;
import jakarta.persistence.ManyToOne;
@Entity
public class Room {

	@Id
	private Integer roomNumber;

	private String roomType;
	private Boolean unavailable;

	@ManyToOne
	@JoinColumns({ @JoinColumn(name = "blockfloor", referencedColumnName = "blockFloor"),
			@JoinColumn(name = "blockcode", referencedColumnName = "blockCode") })
	private Block block;

}
