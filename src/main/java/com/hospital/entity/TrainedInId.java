package com.hospital.entity;

import java.io.Serializable;

import jakarta.persistence.Embeddable;

@Embeddable
public class TrainedInId implements Serializable {

	private Integer physician;
	private Integer treatment;

}
