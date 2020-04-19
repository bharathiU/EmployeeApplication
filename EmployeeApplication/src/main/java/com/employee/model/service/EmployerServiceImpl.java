package com.employee.model.service;

import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.employee.model.entities.Employer;
import com.employee.model.repository.EmployeeRepository;
import com.employee.model.repository.EmployerRepository;
@Service
@Transactional
public class EmployerServiceImpl implements EmployerService{
	@Autowired
	private EmployerRepository emprepo;

	
	 @Override public Optional<Employer> findEmployerById(Long id) { 
		 return emprepo.findEmployerById(id); }
	 
}
