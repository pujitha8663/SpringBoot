package com.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.Module.Employee;
import com.Service.EmpService;

@Controller
public class EmpController {
	 @Autowired
	EmpService es;
	 
	 @RequestMapping("/add")
public String Welcome() {
	return "AddEmp";
	
}
	 @RequestMapping(value="/save", method = RequestMethod.POST)
			 
 public String save(Employee employee) {
		es.save(employee);
		return "Welcome";
	}
	 
	 @RequestMapping(value = "/update" , method = RequestMethod.POST)
	public String update(Employee employee) {
		es.update(employee);
		return null ;
	}
	 
	 
	 
	 
 @RequestMapping(value = "/delete")
	public String delete (@RequestParam("id") Integer id) {
		es.delete(id);
		return "redirect:/findAll";
		
	}

	@RequestMapping(value = "/findAll" )
	public ModelAndView FindAll() {
		
		return new ModelAndView("FindAll","employee",es.findAll()) ;
	}


 
}
