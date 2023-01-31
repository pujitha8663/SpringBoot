package com.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Dao.EmpDao;
import com.Module.Employee;
@Service
public class EmpServiceImpl implements EmpService{
	@Autowired
	EmpDao ed;
	
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
	public List<Employee> findAll() {
		// TODO Auto-generated method stub
		return ed.findAll();
	}

}
