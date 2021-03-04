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
@RequestMapping("/courses")
public class CourseController {
	
	@Autowired
	CourseService service;
	
	@GetMapping
	public String listCourses(Model model) {
		List<Course> courses = new ArrayList<>();
		Course course = new Course();
		course.setCode("CS425");
		course.setName("MPP");
		courses.add(course);
		model.addAttribute("courses", courses);
		System.out.println("Here");
		return "courses";
	}
	
}
