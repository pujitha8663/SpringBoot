package com.Dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate4.HibernateTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.model.Student;
@Repository
@Transactional
public class StudentDaoImpl implements StudentDao {
	@Autowired
HibernateTemplate hibernateTemplate;	
	public void save(Student student) {
		hibernateTemplate.save(student);
		
	}

	public void update(Student student) {
		hibernateTemplate.update(student);
		
	}



	public List<Student> findAll() {
		
		return hibernateTemplate.loadAll(Student.class);
	}

	public Student getById(Integer id) {
		
		return hibernateTemplate.get(Student.class, id);
	}

	public void delete(Integer id) {
		Student s= hibernateTemplate.get(Student.class, id);
		hibernateTemplate.delete(s);
		
	}

	



}
