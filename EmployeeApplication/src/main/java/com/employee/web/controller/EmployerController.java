package com.employee.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.employee.model.entities.Employer;
import com.employee.model.exceptions.EmployerNotFoundException;
import com.employee.model.service.EmployerService;
@RestController
@RequestMapping(path = "/myapi")
public class EmployerController {
	
	private EmployerService employerservice;
	
	  @Autowired 
	  public EmployerController(EmployerService employerservice) {
	  super();
	  this.employerservice = employerservice; 
	  }
	  
	  @GetMapping(path = "/employer/{id}", produces =MediaType.APPLICATION_JSON_VALUE) 
	  public ResponseEntity<Employer>getAnEmployer(@PathVariable(name = "id") Long id) {
		  Employer employer = employerservice.findEmployerById(id).orElseThrow(EmployerNotFoundException:: new); 
		  return new ResponseEntity<Employer>(employer, HttpStatus.OK); 
	  }
	 

}
