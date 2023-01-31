package com.Service;

import java.util.List;

import com.Module.Employee;

public interface EmpService {
	

	public void save(Employee employee);
	public void update(Employee employee);
	public void delete(Integer id);
	//public Employee getById(Integer id);
	List<Employee> findAll ();
}
