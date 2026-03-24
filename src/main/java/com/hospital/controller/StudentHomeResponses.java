package com.hospital.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class StudentHomeResponses {
	
	
	
	@GetMapping("/Student/{name}")
	 public List<String> sayHello(@PathVariable("name") String name ,Model model) {
		
		model.addAttribute("name", name);
//		if (name.equals("cat")) {
//			
//			return 			 List.of("Add Hospital","Get Hospital List");
//
//			
//		}
//		if (name.equals("lion")) {
//			
//			
//
//			return List.of("Add Patient","Get All Patients");
//		}
//	      return null;
//	    }
		
		switch (name) {
		case "cat":
			
			return List.of("View assigned patients","View appointment schedule","Add diagnosis notes","Prescribe medicines","View patient history","View duty schedule","Assist doctors during procedures","Prepare patients for appointments","View assigned rooms/blocks");
		case "lion":
			
			return List.of("Register Patient","Login Patient","Book appointment","View prescriptions","View medical history","Check admission details","View bills","Add doctors ","Add nurses","Create departments","Assign doctors to departments","Manage rooms","Manage blocks","Monitor hospital data","Approve patient admissions");
		case "tiger":
			
			return List.of("Book appointment","Cancel appointment","Reschedule appointment","Assign nurse ","Assign room","Doctor prescribes medicine","View prescription history","Track dosage");
		case "eagle":
			return List.of("Admit patient","Allocate room","Discharge patient","Track room availability","Assign procedure to patient","Check doctor eligibility (trained or not)","Record procedure history","Calculate treatment cost");
		
		case "cheetah":
			
			return List.of("Add new rooms","Track room availability","Assign nurses to blocks","Manage hospital layout","Patient history report","Doctor performance","Revenue report","Room occupancy report");
		
		default:
			return null;
		}
		
	}

}
