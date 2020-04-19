package com.employee.web.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.employee.model.entities.Employee;
import com.employee.model.service.EmployeeService;
@RestController
@RequestMapping(path = "/myapi")
public class EmployeeController {
	private EmployeeService empservice;
    @Autowired
    public EmployeeController(EmployeeService empservice) {
		super();
		this.empservice = empservice;
	}

	 @GetMapping(path = "/employee", produces = MediaType.APPLICATION_JSON_VALUE)
	  public ResponseEntity<List<Employee>> getAllEmployees() { 
		 return new ResponseEntity<List<Employee>>(empservice.findAll(), HttpStatus.OK); }
	  
	  @GetMapping(path="/employee/range/{salary}",produces=MediaType.APPLICATION_JSON_VALUE) 
	  public ResponseEntity<List<Employee>>getBySalaryrange(@PathVariable(name="salary")double salary){
		  return new ResponseEntity<List<Employee>>(empservice.Salaryrange(salary),HttpStatus.OK);
	  }
	 
	
}
