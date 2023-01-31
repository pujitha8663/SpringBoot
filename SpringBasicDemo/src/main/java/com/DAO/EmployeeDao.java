package com.DAO;

import java.util.List;

import com.bean.Spring_Employee;

public interface EmployeeDao  {
	
	
	public void save(Spring_Employee employee );
	
	public void update(Spring_Employee employee);
	
	public void delete(Integer id);
		
  public  List<Spring_Employee> findAll();

}
