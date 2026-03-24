package com.hospital.entity;

import jakarta.persistence.Embeddable;

@Embeddable
public class BlockId {

	private Integer blockFloor;
	private Integer blockCode;

}
