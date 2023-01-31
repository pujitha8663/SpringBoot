package com.Service;

import java.util.List;

import com.Model.Employee;

public interface EmployeeService {
	
	List<Employee> findAll();
	public void save(Employee employee);
	public void update(Employee employee);
	public void deleteById(Integer id);
	public Employee getById(Integer id); 
	
	
	

}
