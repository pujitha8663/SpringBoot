package com.Dao;

import java.util.List;

import com.Model.Student;

public interface StudentDao {

	List<Student> findAll();
	public void save(Student student);
	public void update(Student student);
    public void delete(Integer id);
    public Student getById(Integer id);
}
