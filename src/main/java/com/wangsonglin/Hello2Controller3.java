package com.wangsonglin;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Hello2Controller3 {

	
	@RequestMapping("/helloNew")
	public String helloNew(){
		return "helloNew";
	}
	
}
