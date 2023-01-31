package com.Test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.bean.Spring_Employee;
import com.controller.Employee_Controller;

public class Emp_Test {
	
	public static void main(String[] args) {
		
		ApplicationContext ap = new ClassPathXmlApplicationContext("Spring.xml");
		
		Employee_Controller con = (Employee_Controller) ap.getBean("con");
		
		Spring_Employee employee = new Spring_Employee(101, "puja", 60000.00);
		
		
//	con.save(employee);
	System.out.println(con.findAll());
//		con.update(employee);
		//con.delete(101);
	}
	

}
