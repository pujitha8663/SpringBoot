package com.Service;

import java.util.List;

import com.model.Student;

public interface StudentService {

	public void save(Student student);
	public void update(Student student);
	public void delete(Integer id);
	public Student getById(Integer id);
	List<Student> findAll();
	
	
}
