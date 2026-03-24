package com.hospital.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hospital")
public class HospitalController {

	
	@GetMapping("/getAllHospitals")
	public List<String> getAllHospials() {

		return List.of("Apollo Hospital","Kolkata Hospital","IPG MER Hospital");
	}
}
