package com.Test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.Controller.EmpController;
import com.Module.Employee;

public class Test {
	public static void main(String[] args) {
		
	
	ApplicationContext ap = new ClassPathXmlApplicationContext("Spring.xml");
	
	EmpController con = (EmpController) ap.getBean("empc");
	Employee emp = new Employee(107, "ravi", 35000.00);
	//con.save(emp);
	//con.update(emp);
	 // con.delete(107);
   System.out.println( con.findAll());

}
}