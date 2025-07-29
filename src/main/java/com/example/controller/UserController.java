package com.example.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
	
	
	@GetMapping("/{name}")
	public String welcome(@PathVariable String name)
	{
		return "Hi "+name+" !!welcome to first docker application";
	}
	

}
