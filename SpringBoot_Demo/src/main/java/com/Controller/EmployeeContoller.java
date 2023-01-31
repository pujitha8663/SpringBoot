package com.Controller;





import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.Model.Employee;
import com.Service.EmployeeService;


@RestController
public class EmployeeContoller {
	@Autowired
	EmployeeService es;
	
	@GetMapping("/hii")
	public String hello() {
		return "Welcome Spring Boot";
	}
		@GetMapping("/findemp")
		public List<Employee> findAll() {
			
			return es.findAll();
		}

		@PostMapping("/saveemp")
		public void save(@RequestBody Employee employee) {
			es.save(employee);
			
		}

	    @PutMapping("/updateemp")
		public void update(@RequestBody Employee employee) {
			es.update(employee);
			
		}

	    @DeleteMapping("/deleteid/{id}")
		public void delete(@PathVariable Integer id) {
			es.delete(id);
		}

		@GetMapping("/getid/{id}")
		public Employee getById(@PathVariable Integer id) {
			return es.getById(id);	
		}


	}
	
	



