package com.mumSchud.springbootmum.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mumSchud.springbootmum.entity.Faculty;
import com.mumSchud.springbootmum.repository.FacultyRepository;

import java.util.List;

@Service
public class facultyService {
    @Autowired(required = true)
    private FacultyRepository repository;

    public Faculty saveFaculty(Faculty faculty) {
        return repository.save(faculty);
    }

    public List<Faculty> getFaculties() {
        return repository.findAll();
    }

    public Faculty getFacultyById(int id) {
        return repository.findById(id).orElse(null);
    }

    public String deleteFaculty(int id) {
        repository.deleteById(id);
        return "Faculty removed !! " + id;
    }

    public Faculty updateFaculty(Faculty faculty,int id) {
    	Faculty existingfaculty = repository.findById(id).orElse(null);
    	existingfaculty.setFirstname(faculty.getFirstname());
    	existingfaculty.setLastname(faculty.getLastname());
    	existingfaculty.setAge(faculty.getPositoin());
        return repository.save(existingfaculty);
    }

}