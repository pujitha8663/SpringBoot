package com.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;


import com.Model.Employee;
import com.Service.EmployeeServiceImpl;

@Controller
public class EmployeeController {
@Autowired
	EmployeeServiceImpl es;
	@GetMapping("/findAll")
	public List<Employee> findAll(){
		return es.findAll();
		
	}
	@PostMapping("/save")
	public Employee save(Employee employee) {
		es.save(employee);
		return employee;
		
	}
	@PutMapping("/update")
	public Employee update(Employee employee) {
		es.save(employee);
		return employee;
		
	}
	@GetMapping("/getById/{id}")
	public Employee getById(@PathVariable Integer id) {
		return es.getById(id);
		
		
	}
	@GetMapping("/deleteById/{id}")
	public String deleteById(@PathVariable Integer id) {
		es.deleteById(id);
		return "Deleted Sucessfully ID "+id;
	
}
}
