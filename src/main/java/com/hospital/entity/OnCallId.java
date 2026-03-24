package com.hospital.entity;

import java.io.Serializable;
import java.time.LocalDateTime;

import jakarta.persistence.Embeddable;
import jakarta.persistence.Entity;

@Embeddable
public class OnCallId implements Serializable {

	private Integer nurse;
	private Integer blockFloor;
	private Integer blockCode;
	private LocalDateTime onCallStart;
	private LocalDateTime onCallEnd;

}
