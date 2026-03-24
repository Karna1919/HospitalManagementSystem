package com.hospital.entity;

import java.io.Serializable;
import java.time.LocalDateTime;

import jakarta.persistence.Embeddable;
@Embeddable
public class PrescribesId implements Serializable {

	private Integer physician;
	private Integer patient;
	private Integer medication;
	private LocalDateTime date;
}
