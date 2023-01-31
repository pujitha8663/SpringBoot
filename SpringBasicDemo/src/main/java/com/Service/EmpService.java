package com.Service;

import java.util.List;

import com.DAO.EmployeeDao;
import com.bean.Spring_Employee;

public interface EmpService {

	public void save(Spring_Employee employee );
	  public  List<Spring_Employee> findAll();
     public void update(Spring_Employee employee);
     public void delete(Integer id);
}
