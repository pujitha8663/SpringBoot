package com.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.stereotype.Service;

import com.Dao.EmployeeDao;
import com.Module.Employee;
@Service
public class EmpServiceImpl implements EmpService{
 @Autowired
 EmployeeDao es;
	

	@Override
	public void save(Employee employee) {
		es.save(employee);
		
	}

	@Override
	public void update(Employee employee) {
		es.update(employee);
		
	}

	@Override
	public void delete(Integer integer) {
		es.delete(integer);
		
	}


	public List<Employee> findAll() {
	return es.findAll();
		
	}

}
