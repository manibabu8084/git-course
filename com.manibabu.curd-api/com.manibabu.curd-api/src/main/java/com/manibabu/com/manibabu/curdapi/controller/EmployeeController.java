package com.manibabu.com.manibabu.curdapi.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.manibabu.com.manibabu.curdapi.Employee;
import com.manibabu.com.manibabu.curdapi.service.EmployeeService;

@RestController
@RequestMapping("/employees")
public class EmployeeController {
	
	private final EmployeeService employeeService;

	@Autowired
	public EmployeeController(EmployeeService employeeService) {
		this.employeeService = employeeService;
	}

	@GetMapping
	public List<Employee> getAllEmployees() {
		return employeeService.getAllEmployees();
	}

	@GetMapping("/{id}")
	public Employee getEmployeeById(@PathVariable int id) {
		Optional <Employee> employee = employeeService.getEmployeeById(id);
		return employee.orElse(null);

	}

	@PostMapping
	public Employee createEmployee(@RequestBody Employee employee) {
		return employeeService.createEmployee(employee);
	}

	@PutMapping("/{id}")
	public Employee updateEmployee(@PathVariable int id, @RequestBody Employee updatedEmployee) {
		return employeeService.updateEmployee(id, updatedEmployee);
	}

	@DeleteMapping("/{id}")
	public void deleteEmployee(@PathVariable int id) {
		employeeService.deleteEmployee(id);
	}
}