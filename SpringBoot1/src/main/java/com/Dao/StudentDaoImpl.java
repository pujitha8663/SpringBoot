package com.Dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.Model.Student;
@Repository
public class StudentDaoImpl implements StudentDao{
@Autowired
	JdbcTemplate jt;
	
	@Override
	public List<Student> findAll() {
		
		return jt.query("select * from student", new BeanPropertyRowMapper(Student.class));
	}

	@Override
	public void save(Student student) {
		jt.update("insert into student values(?,?,?)" , new Object[] {student.getSid(),student.getSfee(),student.getSname()});
		
	}

	@Override
	public void update(Student student) {
		jt.update("update student set sfee=?,sname=? where sid=?", new Object[] {student.getSfee(),student.getSname(),student.getSid()} );
		
	}

	@Override
	public void delete(Integer id) {
		jt.update("delete from student where sid =?" , new Object[] {id});
		
	}

	@Override
	public Student getById(Integer id) {
		
		return jt.queryForObject("select* from student where sid=?", new BeanPropertyRowMapper<>(Student.class), new Object[] {id} );
	}

}
