package com.Dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.Model.Employee;
@Repository
public class EmployeeDaoImpl implements EmployeeDao{
Employee e;
	
	@Override
	public List<Employee> findAll() {
		
		return null;
	}

	@Override
	public void save(Employee employee) {
		
		
	}

	@Override
	public void update(Employee employee) {
		
		
	}

	@Override
	public void delete(Integer id) {
	
		
	}

	@Override
	public Employee GetbyId(Integer id) {
		
		return null;
	}

}
