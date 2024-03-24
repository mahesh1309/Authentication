package com.authTest.Authentication.controller;


import java.security.Principal;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class FirstController {
	
	@GetMapping("email")
	public Principal getName(Principal principal) {
		return principal;
	}
	@GetMapping
	public String sayHi() {
		return "Here you go!";
	}
}
