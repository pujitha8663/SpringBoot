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

import com.Model.Student;
import com.Service.StudentService;
@RestController
public class StudentController {
@Autowired
	StudentService se;
   @GetMapping("/hii")
    public String hello() {
	return "Welcome Spring Boot";
}
     @GetMapping("/findstu")
	public List<Student> findAll() {
		
		return se.findAll();
	}

       @PostMapping("/save")
	public void save(@RequestBody Student student) {
		se.save( student);
		
	}

  @PutMapping("/update")
	public void update(@RequestBody Student student) {
		se.update(student);
		
	}
  @DeleteMapping("/delete/{id}")
	public void delete(@PathVariable Integer id) {
		se.delete(id);
		
	}

 @GetMapping("/getid/{id}")
	public Student getById(@PathVariable Integer id) {
	
		return se.getById(id);
	}

}
