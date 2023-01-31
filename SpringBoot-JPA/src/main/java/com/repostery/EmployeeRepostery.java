package com.repostery;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Model.Employee;

public interface EmployeeRepostery extends JpaRepository<Employee, Integer> {
	

}