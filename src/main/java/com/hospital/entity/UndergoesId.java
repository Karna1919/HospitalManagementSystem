package com.hospital.entity;

import java.io.Serializable;
import java.time.LocalDateTime;

import jakarta.persistence.Embeddable;

@Embeddable
public class UndergoesId implements Serializable {

	private Integer patient;
	private Integer procedures;
	private Integer stay;
	private LocalDateTime dateUndergoes;

}
