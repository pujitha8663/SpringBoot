package com.Dao;

import java.util.List;

import com.model.Student;

public interface StudentDao {
	
	public void save(Student student);
	public void update(Student student);
    public void delete(Integer id);
	public Student getById(Integer id);
	List<Student> findAll();

}
