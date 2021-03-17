package com.mumSchud.springbootmum.controllers;

import java.security.Principal;

import java.security.Principal;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.mumSchud.springbootmum.entity.Course;
import com.mumSchud.springbootmum.entity.Faculty;
import com.mumSchud.springbootmum.entity.Section;
import com.mumSchud.springbootmum.entity.Student;
import com.mumSchud.springbootmum.service.CourseService;
import com.mumSchud.springbootmum.service.SectionService;
import com.mumSchud.springbootmum.service.facultyService;
import com.mumSchud.springbootmum.service.studentService;

@Controller
public class PagesController {
	@Autowired
    private SectionService service;
  @Autowired
    private CourseService courseService;
  @Autowired
    private facultyService facultyService;
  @Autowired
  private studentService studentService;
	
  
  @RequestMapping("/")
	public String homePage() {
		return "index";
	}

@RequestMapping("/admin")
public String adminPage(Model model, Principal principal) {
	model.addAttribute("authUserName", principal.getName());
	return "adminHomePage";
}

@RequestMapping("/student")
public String studentPage(Model model,Principal principal) {
	List<Section>sections=service.getSections();
	List<Course>courses=courseService.findAll();
	List<Faculty>faculties=facultyService.getFaculties();
	Student student=studentService.getStudentByEmail(principal.getName());
	model.addAttribute("student",student);
	model.addAttribute("sections", sections);
	model.addAttribute("courses", courses);
	model.addAttribute("faculties", faculties);
	  return "studentHomePage";	}

}
