package com.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Dao.StudentDao;
import com.model.Student;
@Service
public class StudentServiceImpl implements StudentService{
	@Autowired
StudentDao sd;
	public void save(Student student) {
	  sd.save(student);
	}

	public void update(Student student) {
		sd.update(student);
		
	}

	public void delete(Integer id) {
		sd.delete(id);
		
	}

	public List<Student> findAll() {
		
		return sd.findAll();
	}

	public Student getById(Integer id ) {
		// TODO Auto-generated method stub
		return sd.getById(id);
	}

}
