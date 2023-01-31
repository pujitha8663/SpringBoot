package com.controller;

import java.util.List;


import com.Service.EmpService;
import com.bean.Spring_Employee;

public class Employee_Controller {
	
	EmpService es;

	public void setEs(EmpService es) {
		this.es = es;
	}
	public void save(Spring_Employee employee) {
		es.save(employee);
		// TODO Auto-generated method stub
		
	}
public List<Spring_Employee> findAll() {
		
		return es.findAll();
	}
    public void update(Spring_Employee employee) {
    	es.update(employee);
	
}
public void delete(Integer id) {
	es.delete(id);
	
}
}
