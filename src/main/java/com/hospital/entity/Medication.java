package com.hospital.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
@Entity
public class Medication {

	@Id
	private Integer code;

	private String name;
	private String brand;
	private String description;

}
