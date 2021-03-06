package com.mumSchud.springbootmum.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mumSchud.springbootmum.entity.Course;
import com.mumSchud.springbootmum.repository.CourseRepository;

@Service
public class CourseService {
	
	@Autowired
	private CourseRepository repository;
	
	public List<Course> findAll() {
		return repository.findAll(); 
	}
	
	public Course getOne(int id) {
		return repository.getOne(id);
	}
}
