package com.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.Module.Employee;
import com.service.EmpService;
@Controller("empc")
public class EmpController {
	@Autowired
	EmpService ed;
	
	
	public void save(Employee employee) {
		ed.save(employee);
	}
	public void update(Employee employee) {
		ed.update(employee);
	}
	public void delete(Integer integer) {
		ed.delete(integer);
	}

	public List<Employee> findAll() {
	return ed.findAll();
		
	}

}
