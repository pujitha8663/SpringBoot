package com.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.Service.StudentService;
import com.model.Student;
@Controller("stuc")
public class StudentController {
	@Autowired
StudentService se;
	public void save(Student student) {
		se.save(student);
		
	}

	public void update(Student student) {
		se.update(student);
		
	}

	public void delete(Integer id) {
		se.delete(id);
		
	}

	public List<Student> findAll() {
		
		return se.findAll();
	}
	
public Student getById(Integer id) {
		
		return se.getById(id);
	}

}
