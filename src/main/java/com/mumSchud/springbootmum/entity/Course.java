package com.mumSchud.springbootmum.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;
<<<<<<< Updated upstream

@Data
@Entity
=======
import lombok.Getter;
import lombok.Setter;

@Data
@Entity
@Getter @Setter
>>>>>>> Stashed changes
@Table(name = "courses")
public class Course {
	@Id
	@GeneratedValue
	private int id;
	
	private String name;
	private String code;
<<<<<<< Updated upstream
	
=======

>>>>>>> Stashed changes
	public Course() {
		
	}
	
	public Course(String name, String code) {
		super();
		this.name = name;
		this.code = code;
	}


	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
}
