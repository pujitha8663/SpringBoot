package com.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Dao.StudentDao;
import com.Model.Student;
@Service
public class StudentServiceImpl implements StudentService {
@Autowired
	StudentDao sd;
	@Override
	public List<Student> findAll() {
		// TODO Auto-generated method stub
		return sd.findAll();
	}

	@Override
	public void save(Student student) {
		sd.save(student);
		
	}

	@Override
	public void update(Student student) {
		sd.update(student);
		
	}

	@Override
	public void delete(Integer id) {
		sd.delete(id);
		
	}

	@Override
	public Student getById(Integer id) {
	
		return sd.getById(id);
	}

}
