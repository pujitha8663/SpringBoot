package com.Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.Module.Employee;
import com.mapper.EmployeeRowMapper;
@Repository
public class Emp_Dao_Impl implements EmployeeDao {
@Autowired
	JdbcTemplate js;

@Override
public void save(Employee employee) {
	js.update("insert into employee values(?,?,?)", new Object[] {employee.getId(),employee.getName(),employee.getSalary()});
	
}

@Override
public void update(Employee employee) {
	js.update("update employee set ename=?, esalary=? where eid=?", new Object[] {employee.getName(),employee.getSalary(),employee.getId()} );
	
}

@Override
public void delete(Integer integer) {
	js.update("delete from employee eid=?",  new Object[] {integer});
	
}


public List<Employee> findAll() {
	return js.query("select*from employee", new EmployeeRowMapper());
	}
}
	
	

