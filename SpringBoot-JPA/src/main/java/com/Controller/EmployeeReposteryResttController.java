package com.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.Model.Employee;
import com.Service.EmployeeService;
@RestController
public class EmployeeReposteryResttController {
@Autowired
		EmployeeService employeeService;
		
		
		@GetMapping("/findAllEmp")
		public ResponseEntity<?> findAll() {

			try {
			return new ResponseEntity<>(HttpStatus.OK).ok(employeeService.findAll());
			
			}catch (Exception e) {
				return new ResponseEntity<>(HttpStatus.NOT_FOUND).ok("No records Found");
			}
		}
		
		
		@PostMapping("/saveEmp")
		public ResponseEntity<?> save(@RequestBody Employee employee) {
			try {
				employeeService.save(employee);
				return new ResponseEntity<>(HttpStatus.OK).ok(employee+" Record Saved sucessfully");
				}catch (Exception e) {
					return new ResponseEntity<>(HttpStatus.NOT_FOUND).ok("enter valid details");
				}
			}
		
		@PutMapping("/empupdate")
		public ResponseEntity<?> update (@RequestBody Employee employee) {
			employeeService.update(employee);
			try {
				employeeService.update(employee);
				return new ResponseEntity<>(HttpStatus.OK).ok(employee);
				}catch (Exception e) {
					return new ResponseEntity<>(HttpStatus.NOT_FOUND).ok("enter valid details");
				}
			}
		
		@GetMapping("/EmpgetById/{id}")
		public ResponseEntity<?> getById(@PathVariable Integer id) {
			try {
				
				return new ResponseEntity<>(HttpStatus.OK).ok(employeeService.getById(id));
				}catch (Exception e) {
					return new ResponseEntity<>(HttpStatus.NOT_FOUND).ok("record Not found in this ID "+id);
				}
			}
		@GetMapping("/EmpdeleteById/{id}")
		public ResponseEntity<?> deleteById(@PathVariable Integer id) {
	try {
				employeeService.deleteById(id);
				return new ResponseEntity<>(HttpStatus.OK).ok(  id+" Record deleted sucessfully ");
				}catch (Exception e) {
					return new ResponseEntity<>(HttpStatus.NOT_FOUND).ok("record Not found in this ID "+id);
				}
			}
			
		}
		


