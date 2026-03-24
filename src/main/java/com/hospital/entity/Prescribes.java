package com.hospital.entity;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.MapsId;

public class Prescribes {
	
	 @EmbeddedId
	    private PrescribesId id;

	    private String dose;

	    @ManyToOne
	    @MapsId("physician")
	    @JoinColumn(name = "physician")
	    private Physician physician;

	    @ManyToOne
	    @MapsId("patient")
	    @JoinColumn(name = "patient")
	    private Patient patient;

	    @ManyToOne
	    @MapsId("medication")
	    @JoinColumn(name = "medication")
	    private Medication medication;

	    @ManyToOne
	    @JoinColumn(name = "appointment")
	    private Appointment appointment;

}
