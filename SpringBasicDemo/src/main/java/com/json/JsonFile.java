package com.json;





import java.io.FileWriter;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Workbook;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.controller.Employee_Controller;
import com.google.gson.Gson;


public class JsonFile {
	public static void main(String[] args) {
		ApplicationContext ap = new ClassPathXmlApplicationContext("Spring.xml");
	
	Employee_Controller con = (Employee_Controller) ap.getBean("con");
		
		System.out.println(con.findAll());
		Gson gson = new Gson();
		String json = gson.toJson(con.findAll());
		
	
		
		try {
			FileWriter writer=new FileWriter("Allemps.json");
			writer.write(json);
			writer.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
