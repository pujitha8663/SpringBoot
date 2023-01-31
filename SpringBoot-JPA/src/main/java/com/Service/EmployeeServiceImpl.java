package com.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Model.Employee;
import com.repostery.EmployeeRepostery;
@Service
public class EmployeeServiceImpl implements EmployeeService{
@Autowired
	EmployeeRepostery er;

	
	@Override
	public List<Employee> findAll() {
		
		return er.findAll();
	}

	@Override
	public void save(Employee employee) {
		er.save(employee);
		
	}

	@Override
	public void update(Employee employee) {
		er.save(employee);
		
	}

	

	@Override
	public Employee getById(Integer id) {
		
		return er.findById(id).get();
	}

	@Override
	public void deleteById(Integer id) {
		er.deleteById(id);
		
	}

}
