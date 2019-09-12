package com.example.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AppController {
	
	@RequestMapping(value = "/hi")
	public String getResponse(){
		
		return "this is amaravathi";
		
	}

}
