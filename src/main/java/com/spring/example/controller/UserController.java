package com.spring.example.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")
public class UserController {
	
	@RequestMapping(value="/hello",method=RequestMethod.GET)
	public String sayHelloWorld(){
		return "Heloo world.";
	}

}
