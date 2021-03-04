package com.mumSchud.springbootmum.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.mumSchud.springbootmum.entity.Student;
import com.mumSchud.springbootmum.service.studentService;

@Controller
public class TestController {
	
	@RequestMapping("/welcome")
	public String firstPage() {
		return "welcome";
	}

	@RestController
	public class StudentController {

	    @Autowired
	    private studentService service;

	    @PostMapping("/students")
	    public Student addStudent( @RequestParam String firstname,
                @RequestParam String lastname,
                @RequestParam int age) {
	    	Student student=new Student(firstname,lastname,age);
	        return service.saveStudent(student);
	    }

	    @GetMapping("/students")
	    public List<Student> findAllStudents() {
        return service.getStudents();
	    }

	    @GetMapping("/students/{id}")
	    public Student findStudentById(@PathVariable int id) {
	        return service.getStudentById(id);
	    }


	    @PutMapping("/students/{id}")
	    public Student updateStudent(@RequestParam String firstname,
                @RequestParam String lastname,
                @RequestParam int age,@PathVariable int id) {
	    	Student student=new Student(firstname,lastname,age);
	        return service.updateStudent(student,id);
	    }

	    @DeleteMapping("/students/{id}")
	    public String deleteStudent(@PathVariable int id) {
	        return service.deleteStudent(id);
	    }
	}
}