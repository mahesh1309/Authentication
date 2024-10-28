package com.authTest.Authentication.controller;


import java.security.Principal;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class FirstController {

	@GetMapping("/home")
	public String homePage(){
		return "This is home/page";
	}

	@GetMapping("email")
	public Principal getName(Principal principal) {
		return principal;
	}
	
	
	@GetMapping
	public String sayHi(Principal principal) {
		return "Hey "+ principal.getName();
	}
}
