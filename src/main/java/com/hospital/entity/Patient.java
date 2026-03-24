package com.hospital.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
@Entity
public class Patient {

	@Id
	private Integer ssn;

	private String name;
	private String address;
	private String phone;
	private Integer insuranceId;

	@ManyToOne
	@JoinColumn(name = "pcp")
	private Physician physician;

}
