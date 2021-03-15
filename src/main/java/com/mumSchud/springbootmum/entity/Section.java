package com.mumSchud.springbootmum.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@Entity
@Table(name = "Section")
public class Section {

	@Id
	@GeneratedValue
    private Long id;

    private Integer capacity=0;

//    @JoinColumn(name = "block_id")
//    @ManyToOne
//    private Block block;

//    @JoinColumn(name = "course_id")
//    @ManyToOne
//    private Course course;

    @JoinColumn(name = "faculty_id")
    @ManyToOne
    private Faculty faculty;

    @JoinColumn(name = "schedule_id")
    @ManyToOne
    private Schedule schedule;

    public Long getId() {
        return id;
    }

    public void setUname(Long id) {
        this.id = id;
    }

    public Integer getCapacity() {
        return capacity;
    }

    public void setCapacity(Integer capacity) {
        this.capacity = capacity;
    }

//    public Block getBlock() {
//        return block;
//    }
//
//    public void setBlock(Block block) {
//        this.block = block;
//    }

//    public Course getCourse() {
//        return course;
//    }
//
//    public void setCourse(Course course) {
//        this.course = course;
//    }

    public Faculty getFaculty() {
        return faculty;
    }

    public void setFaculty(Faculty faculty) {
        this.faculty = faculty;
    }

    public Schedule getSchedule() {
        return schedule;
    }

    public void setSchedule(Schedule schedule) {
        this.schedule = schedule;
    }
}
