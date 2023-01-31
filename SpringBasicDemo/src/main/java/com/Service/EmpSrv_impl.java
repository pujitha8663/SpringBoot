package com.Service;

import java.util.List;

import com.DAO.EmployeeDao;
import com.bean.Spring_Employee;

public class EmpSrv_impl implements EmpService {

	
	EmployeeDao ed;

	public void setEd(EmployeeDao ed) {
		this.ed = ed;
	}

	@Override
	public void save(Spring_Employee employee) {
		ed.save(employee);
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Spring_Employee> findAll() {
		
		return ed.findAll();
	}

	@Override
	public void update(Spring_Employee employee) {
		ed.update(employee);
		
	}

	@Override
	public void delete(Integer id) {
		// TODO Auto-generated method stub
		ed.delete(id);
	}

	
	
}
