package com.slin.app.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/home")
public class HimeCintroller {

	@RequestMapping(method=RequestMethod.GET)
	@ResponseBody
	public String getHome () {
		return "hi";
	}
}
