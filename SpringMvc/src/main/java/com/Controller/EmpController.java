package com.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.Module.Employee;
import com.Service.EmpService;

@Controller ("empc")
public class EmpController {
	 @Autowired
	EmpService es;

 public void save(Employee employee) {
		es.save(employee);
	}
	public void update(Employee employee) {
		es.update(employee);
	}

	public void delete(Integer id) {
		es.delete(id);
		
	}

	
	public List<Employee> findAll() {
		// TODO Auto-generated method stub
		return es.findAll();
	}


 
}
