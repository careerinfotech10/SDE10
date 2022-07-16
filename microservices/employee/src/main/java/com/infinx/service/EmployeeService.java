package com.infinx.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fasterxml.jackson.databind.RuntimeJsonMappingException;
import com.infinx.entity.Employee;
import com.infinx.repo.EmployeeRepo;

@Service
public class EmployeeService {

	@Autowired
	private EmployeeRepo employeeRepo;

	public List<Employee> getAllEmployees() {
		// TODO Auto-generated method stub
		return employeeRepo.findAll();
	}

	public Employee getEmployeeById(Long id) {
		// TODO Auto-generated method stub
		Optional<Employee> findById = employeeRepo.findById(id);
		if (!findById.isPresent()) {

			throw new RuntimeException("data not found with id " + id);
		}

		return findById.get();
	}

	public String deleteEmployeeById(Long id) {
		// TODO Auto-generated method stub
		String msg = "Unable to delete";
		Optional<Employee> findById = employeeRepo.findById(id);
		if (findById.isPresent()) {
			msg = "Employee Deleted Successfully !!!";
			employeeRepo.deleteById(id);
		}
		return msg;
	}

	public Employee saveEmployee(Employee employee) {
		return employeeRepo.save(employee);
	}

	public Employee updateEmployeeById(Employee employee, Long id) {

		if (!employeeRepo.existsById(id)) {
			throw new RuntimeException("Unable to update Data " + id);
		}
		employee.setId(id);
		return employeeRepo.save(employee);
	}

}
