package com.hospital.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Nurse {

	@Id
	private Integer employeeId;

	private String name;
	private String position;
	private Boolean registered;
	private Integer ssn;

}
