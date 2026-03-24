package com.hospital.entity;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.MapsId;
@Entity
public class AffiliatedWith 
{
	
	@EmbeddedId
    private AffiliatedWithId id;

    private Boolean primaryAffiliation;

    @ManyToOne
    @MapsId("physician")
    @JoinColumn(name = "physician")
    private Physician physicianObj;

    @ManyToOne
    @MapsId("department")
    @JoinColumn(name = "department")
    private Department departmentObj;

}
