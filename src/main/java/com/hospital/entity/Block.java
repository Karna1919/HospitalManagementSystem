package com.hospital.entity;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
@Entity
public class Block {

	@EmbeddedId
	private BlockId id;

}
