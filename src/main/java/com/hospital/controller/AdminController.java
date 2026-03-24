package com.hospital.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.hospital.entity.Physician;

@RestController
public class AdminController {
	
	
	@PostMapping("/adddoctors")
	public void addDoctors(@RequestBody Physician physician) {
		
		System.out.println(physician);
		
		
		

		
	}
	
	
	

}
