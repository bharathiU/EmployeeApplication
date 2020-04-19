package com.employee;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.employee.model.entities.Employee;
import com.employee.model.entities.Employer;
import com.employee.model.repository.EmployeeRepository;
import com.employee.model.repository.EmployerRepository;

@SpringBootApplication
public class EmployeeApplication implements CommandLineRunner{
	    @Autowired
		private EmployerRepository emprepo;
	    @Autowired
		private EmployeeRepository employeeRepository;

	public static void main(String[] args) {
		SpringApplication.run(EmployeeApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		/*
		 * Employer employer1=new Employer("mahira"); Employer employer2=new
		 * Employer("medhan"); emprepo.save(employer1); emprepo.save(employer2);
		 * 
		 * Employee employee1=new
		 * Employee("madhuri",15000,"9999999999","Delhi","sales"); Employee
		 * employee2=new Employee("ram",10000,"6789123456","Bangolre","maerketing");
		 * Employee employee3=new
		 * Employee("hari",25000,"9997899999","Chennai","production"); Employee
		 * employee4=new Employee("jagan",80000,"8899999999","madurai","transporting");
		 * Employee employee5=new
		 * Employee("ramya",40000,"9999988899","hyderabad","typist");
		 * 
		 * employee1.setEmployer(employer1); employee2.setEmployer(employer2);
		 * employee3.setEmployer(employer1); employee5.setEmployer(employer2);
		 * employee4.setEmployer(employer1);
		 * 
		 * employeeRepository.save(employee1); employeeRepository.save(employee2);
		 * employeeRepository.save(employee3); employeeRepository.save(employee4);
		 * employeeRepository.save(employee5);
		 */
		 
		
	}

}
