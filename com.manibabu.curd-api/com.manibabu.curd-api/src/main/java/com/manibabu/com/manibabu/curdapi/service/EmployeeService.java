package com.manibabu.com.manibabu.curdapi.service;

import java.util.List;	
import java.util.Optional;


import org.springframework.stereotype.Service;

import com.manibabu.com.manibabu.curdapi.Employee;
import com.manibabu.com.manibabu.curdapi.repository.EmployeeRepository;

@Service
public class EmployeeService {
	private final EmployeeRepository employeeRepository;

	
	public EmployeeService(EmployeeRepository employeeRepository) {
		this.employeeRepository = employeeRepository;
	}

	public List<Employee> getAllEmployees() {
		return employeeRepository.findAll();
	}

	public Optional<Employee> getEmployeeById(int id) {
		return employeeRepository.findById(id);
	}

	public Employee createEmployee(Employee employee) {
		return employeeRepository.save(employee);
	}
	
	public Employee updateEmployee(int id, Employee updatedEmployee) {
		if (employeeRepository.existsById(id)) {
			updatedEmployee.setId(id);
			return employeeRepository.save(updatedEmployee);
		}
		return null;
	}

	public void deleteEmployee(int id) {
		employeeRepository.deleteById(id);
	}
}
