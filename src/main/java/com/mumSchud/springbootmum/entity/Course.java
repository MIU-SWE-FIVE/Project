package com.mumSchud.springbootmum.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Data
@NoArgsConstructor
@Entity
public class Course {
	@Id
	@GeneratedValue
	private int id;
	
	@Getter @Setter
	private String name;
	@Getter @Setter
	private String code;
	public void setCode(String string) {
		// TODO Auto-generated method stub
		
	}
	public void setName(String string) {
		// TODO Auto-generated method stub
		
	}
	
}
