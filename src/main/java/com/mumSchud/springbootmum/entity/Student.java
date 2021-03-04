package com.mumSchud.springbootmum.entity;

import lombok.AllArgsConstructor;
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@AllArgsConstructor
@Entity
@Table(name = "STUDENT_TBL")
public class Student {

    @Id
    @GeneratedValue
    private int id;
    private String firstname;
    private String lastname;
    private int age;
    
	public Student(String firstname, String lastname, int age) {
		this.firstname=firstname;
		this.lastname=lastname;
		this.age=age;
	}
	public Student() {
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
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
}