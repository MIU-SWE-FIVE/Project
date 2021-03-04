package com.mumSchud.springbootmum.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mumSchud.springbootmum.entity.Student;

public interface StudentRepository extends JpaRepository<Student,Integer> {
	
}