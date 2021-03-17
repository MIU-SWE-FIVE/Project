package com.mumSchud.springbootmum.controllers;

import java.security.Principal;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PagesController {
	@RequestMapping("/")
	public String homePage() {
		return "index";
	}

	@RequestMapping("/admin")
	public String adminPage(Model model, Principal principal) {
		model.addAttribute("authUserName", principal.getName());
		return "adminHomePage";
	}
}
