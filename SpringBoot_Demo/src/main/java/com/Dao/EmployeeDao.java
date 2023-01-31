package com.Dao;

import java.util.List;

import com.Model.Employee;

public interface EmployeeDao {
	
	List<Employee> findAll();
	public void save(Employee employee);
    public void update(Employee employee);
    public void delete(Integer id);
    public Employee GetbyId(Integer id);
}
