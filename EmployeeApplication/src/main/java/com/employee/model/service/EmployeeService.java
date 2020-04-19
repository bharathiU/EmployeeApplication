package com.employee.model.service;

import java.util.List;
import java.util.Optional;

import com.employee.model.entities.Employee;

public interface EmployeeService {
	public List<Employee> Salaryrange(double salary);
    public List<Employee> findAll();
}
