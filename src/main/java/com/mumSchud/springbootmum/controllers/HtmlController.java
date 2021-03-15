package com.mumSchud.springbootmum.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.mumSchud.springbootmum.entity.Course;
import com.mumSchud.springbootmum.service.CourseService;

@Controller
@RequestMapping("/html")
public class HtmlController {
	
	
	@GetMapping
	public String listCourses(Model model) {
		
		return "faculties";
	}
	
}
