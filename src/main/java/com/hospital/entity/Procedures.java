package com.hospital.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
@Entity
public class Procedures {

	@Id
	private Integer code;

	private String name;
	private Double cost;

}
