package com.employee.model.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RestController;

import com.employee.model.entities.Employer;

@Repository
public interface EmployerRepository extends JpaRepository<Employer, Long>{
	public Optional<Employer> findEmployerById(Long id);
}
