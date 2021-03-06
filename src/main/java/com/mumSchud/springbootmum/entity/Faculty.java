package com.mumSchud.springbootmum.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "FACULTY_TBL")
public class Faculty {

    @Id
    @GeneratedValue
    private int id;
    private String firstname;
    private String lastname;
    private String position;
    
	public Faculty(String firstname, String lastname, String position) {
		this.firstname=firstname;
		this.lastname=lastname;
		this.position=position;
	}
	public Faculty() {
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public String getPositoin() {
		return position;
	}
	public void setAge(String position) {
		this.position = position;
	}
}