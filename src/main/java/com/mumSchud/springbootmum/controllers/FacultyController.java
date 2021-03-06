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

import com.mumSchud.springbootmum.entity.Faculty;
import com.mumSchud.springbootmum.service.facultyService;

@Controller
public class FacultyController {

	@RestController
	public class RestFacultyController {

	    @Autowired
	    private facultyService service;

	    @PostMapping("/faculties")
	    public Faculty addStudent( @RequestParam String firstname,
                @RequestParam String lastname,
                @RequestParam String position) {
	    	Faculty faculty=new Faculty(firstname,lastname,position);
	        return service.saveFaculty(faculty);
	    }

	    @GetMapping("/faculties")
	    public List<Faculty> findAllFaculties() {
        return service.getFaculties();
	    }

	    @GetMapping("/faculties/{id}")
	    public Faculty findFacultyById(@PathVariable int id) {
	        return service.getFacultyById(id);
	    }


	    @PutMapping("/faculties/{id}")
	    public Faculty updateStudent(@RequestParam String firstname,
                @RequestParam String lastname,
                @RequestParam String position,@PathVariable int id) {
	    	Faculty faculty=new Faculty(firstname,lastname,position);
	        return service.updateFaculty(faculty,id);
	    }

	    @DeleteMapping("/faculties/{id}")
	    public String deleteFaculty(@PathVariable int id) {
	        return service.deleteFaculty(id);
	    }
	}
}