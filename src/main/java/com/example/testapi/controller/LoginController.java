package com.example.testapi.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.testapi.model.AppUser;

@Controller
public class LoginController {
	private Logger log = LoggerFactory.getLogger(LoginController.class);
	
	@GetMapping("/")
	public String index() {
		return "index";
	}
	
	@GetMapping("/login")
	public String login(Model model){
		model.addAttribute("user", new AppUser());
		return "login";
	}
	
	//access only to admin
	@PreAuthorize("hasAuthority('ADMIN')")
	@GetMapping("/admin/home")
	public String adminLandingPage() {
		log.info("Accessing admin page");
		return "admin"; //this name should match to admin.html inside templates folder
	}
	

	//access only for user
	@PreAuthorize("hasAuthority('USER')")
	@GetMapping("/user/home")
	public String userLandingPage() {
		log.info("Accessing user page");
		return "user"; //this name should match to user.html inside templates folder
	}
	

}
