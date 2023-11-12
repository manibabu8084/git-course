package com.manibabu.com.manibabu.curdapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;	
import org.springframework.stereotype.Repository;

import com.manibabu.com.manibabu.curdapi.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Integer> {
}
