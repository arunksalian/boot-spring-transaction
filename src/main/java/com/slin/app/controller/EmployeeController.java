package com.slin.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.slin.app.entity.Employee;
import com.slin.app.service.IEmployeeService;

@Controller
@RequestMapping("/employee")
public class EmployeeController {

	@Autowired
	private IEmployeeService employeeService;	
	
	@RequestMapping(path="/add", method=RequestMethod.GET)
	@ResponseBody
	public String add ( ) {
		Employee employee = employeeService.save(Employee.builder().name("hi").build());
		return "student:"+employee.getId();
	}
}
