package com.authTest.Authentication.controller;


import java.security.Principal;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/authentication")
public class FirstController {
	
	@GetMapping("/name")
	public Principal getName(Principal principal) {
		return principal;
	}
}
