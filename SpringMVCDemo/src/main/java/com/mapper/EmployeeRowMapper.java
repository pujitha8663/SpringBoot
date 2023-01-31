package com.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.Module.Employee;

public class EmployeeRowMapper implements RowMapper<Employee> {

	@Override
	public Employee mapRow(ResultSet rs, int rowNum) throws SQLException {
		Employee employee=new Employee();
		employee.setId(rs.getInt("eid"));
		employee.setName(rs.getNString("ename"));
		employee.setSalary(rs.getDouble("esalary"));
		
		
		return employee;
	}

}
