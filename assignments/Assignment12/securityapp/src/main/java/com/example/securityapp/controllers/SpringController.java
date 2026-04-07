package com.example.securityapp.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.securityapp.service.MyUserDetailService;

@RestController
public class SpringController {
	@Autowired
	MyUserDetailService  myUserDetailService;
	
	@GetMapping("/publicEndPoint")
	public String forPublic() {
		return "this is the open end point for public";
	}
	
	
	@GetMapping("/securedUserEndPoint")
	@PreAuthorize("hasAnyRole('USER','ADMIN')")
	public String forUsers() {
		return "this is the secured end point only for user";
	}
	
	@GetMapping("/securedAdminEndPoint")
	@PreAuthorize("hasRole('ADMIN')")
	public String forAdmins() {
		return "this is the secured end point only for admin";
	}

}
