package com.Dao;

import java.util.List;

import com.Module.Employee;

public interface EmployeeDao {
	
  public void save(Employee employee);
  public void update(Employee employee);
  public void delete(Integer integer);
  List<Employee> findAll();
  

}
