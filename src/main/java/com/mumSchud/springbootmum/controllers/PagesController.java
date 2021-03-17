package com.mumSchud.springbootmum.controllers;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PagesController {
	@RequestMapping("/")
	public String homePage() {
    	  return "index";	
}

@RequestMapping("/admin")
public String adminPage() {
	  return "adminHomePage";	}
}
