package com.apps.controller;

import java.io.IOException;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
public class MainController {
 
			
	/*
	 * Returns a simple message
	 *
	 */
	@GetMapping("/")
	public String getPage() {
						
		return "index";

	}

}
