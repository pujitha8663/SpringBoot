package com.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Dao.EmployeeDao;
import com.Model.Employee;
@Service
public class EmployeeServiceImpl implements EmployeeService{
 @Autowired
	EmployeeDao ed;
	@Override
	public List<Employee> findAll() {
		
		return ed.findAll();
	}

	@Override
	public void save(Employee employee) {
		ed.save(employee);
		
	}

	@Override
	public void update(Employee employee) {
		ed.update(employee);
		
	}

	@Override
	public void delete(Integer id) {
		ed.delete(id);
	}

	@Override
	public Employee getById(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	//@Override
//	public Employee getById(Integer id) {
//		return ed.getById(id);	
//	}

	
}
