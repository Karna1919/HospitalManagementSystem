package com.hospital.entity;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class Physician {

	@Id
	private Integer employeeId;
	private String name;
	private String position;
	private Integer ssn;
	@OneToMany(mappedBy = "head")
	private List<Department> departments;

}
