package com.employee.model.service;

import java.util.Optional;

import com.employee.model.entities.Employer;

public interface EmployerService {
	public Optional<Employer> findEmployerById(Long id);
}
