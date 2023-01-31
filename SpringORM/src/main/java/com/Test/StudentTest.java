package com.Test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;

import com.Controller.StudentController;
import com.model.Student;

public class StudentTest {

public static void main(String[] args) {
	
	ApplicationContext ap = new ClassPathXmlApplicationContext("Springxml.xml");
	
	StudentController con =  (StudentController) ap.getBean("stuc");
	//Student st = new Student(100, "sriman", 33345);
	//con.update(st);
	
	//System.out.println(con.getById(101));
	//con.save(st);
	
	//System.out.println(con.findAll());
	con.delete(100);
}
	
}
