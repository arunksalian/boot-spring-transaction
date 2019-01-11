package com.slin.app.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/employee")
public class EmployeeController {

	
	@RequestMapping(path="/add", method=RequestMethod.GET)
	@ResponseBody
	public String add ( ) {
		return "student";
	}
}
