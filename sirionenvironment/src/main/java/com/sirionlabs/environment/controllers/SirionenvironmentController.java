package com.sirionlabs.environment.controllers;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class SirionenvironmentController {
	
	@RequestMapping("/showCreate")
	public String showCreate() {
		return "createEnvironment";
	}
	
	public String saveEnv() {
		return null;
		
	}

}
