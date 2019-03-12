package com.biswa.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.biswa.demo.command.LoginCommand;

@Controller
public class HomeController {

	@RequestMapping(value="/home",method=RequestMethod.GET)
	public String view(@ModelAttribute("loginCmd") LoginCommand lCmd) {
		System.out.println("view");
		return "welcome";
	}
	
	public void show() {
		
	}
}
