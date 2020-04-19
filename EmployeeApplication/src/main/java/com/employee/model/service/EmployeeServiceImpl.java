package com.employee.model.service;

import java.util.ArrayList;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.employee.model.entities.Employee;
import com.employee.model.repository.EmployeeRepository;

@Service
@Transactional
public class EmployeeServiceImpl implements EmployeeService{
	@Autowired
	private EmployeeRepository emprepo;
	
	  List<Employee> Salaryrange = new ArrayList<Employee>();
	  
	  @Override
	  public List<Employee> findAll() { 
		  return emprepo.findAll(); 
		  }
	  
	  @Override 
	  public List<Employee> Salaryrange(double salary) {
		  for(Employee e:findAll()) { 
			  if(e.getSalary()>salary) { 
				  Salaryrange.add(e); 
				  } 
			  } 
      return Salaryrange;
      }
	 

	
}
