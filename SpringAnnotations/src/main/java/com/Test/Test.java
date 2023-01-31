package com.Test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;

import com.Controller.EmpController;
import com.Module.Employee;

public class Test {
	
	public static void main(String[] args) {
		ApplicationContext ap = new ClassPathXmlApplicationContext("Spring.xml");
		EmpController con =  (EmpController) ap.getBean("empc");
		
		Employee emp = new Employee(102, "shannnuuu", 80000);
//		con.save(emp);
		
	//	con.update(emp);
		System.out.println(con.findAll());
		
	}

}
