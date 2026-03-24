package com.hospital.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
@Entity
public class Department {

	@Id
	private Integer departmentId;

	private String name;

	@ManyToOne
	@JoinColumn(name = "head")
	private Physician head;

}
