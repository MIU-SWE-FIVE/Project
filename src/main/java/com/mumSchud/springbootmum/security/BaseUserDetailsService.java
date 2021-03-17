package com.mumSchud.springbootmum.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.mumSchud.springbootmum.entity.Student;
import com.mumSchud.springbootmum.service.studentService;

@Service
public class BaseUserDetailsService implements UserDetailsService {

	@Autowired
	studentService studentService;
	
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		System.out.println("username is " + username);
		if (username.equals("admin")) {
			AdminUserDetails userDetails = new AdminUserDetails();
			System.out.println(userDetails.getPassword());
			return userDetails;
		}
		
		Student student = studentService.getStudentByEmail(username);
		
		if (student == null)
			throw new UsernameNotFoundException(username);
				
		return new StudentUserDetails(student.getEmail(), student.getPassword());
	}

}
