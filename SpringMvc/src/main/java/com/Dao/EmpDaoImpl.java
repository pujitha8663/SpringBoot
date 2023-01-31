package com.Dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.Module.Employee;
import com.mapper.EmployeeRowMapper;
@Repository
public class EmpDaoImpl implements EmpDao {
@Autowired
 JdbcTemplate js;
	@Override
	public void save(Employee employee) {
		js.update("insert into employee values(?,?,?)", new Object[] {employee.getId(),employee.getName(),employee.getSalary()});
		
	}

	@Override
	public void update(Employee employee) {
		js.update("update employee set ename=?, esalary=? where eid=?",new Object[] {employee.getName(),employee.getSalary(),employee.getId()} );
	
	}

	@Override
	public void delete(Integer id) {
		js.update("delete from employee eid=?",  new Object[] {id});
		
	}

//	@Override
//	public Employee getById(Integer id) {
//		
//		return js.update("", )
//	}

	@Override
	public List<Employee> findAll() {
		
		 return js.query("select*from employee", new EmployeeRowMapper());
	}

	



}
