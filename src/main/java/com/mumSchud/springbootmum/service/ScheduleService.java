package com.mumSchud.springbootmum.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mumSchud.springbootmum.entity.Schedule;
import com.mumSchud.springbootmum.repository.ScheduleRepository;

import java.util.List;

@Service
public class ScheduleService {
    @Autowired(required = true)
    private ScheduleRepository repository;

    public Schedule saveStudent(Schedule schedule) {
        return repository.save(schedule);
    }

    public List<Schedule> getStudents() {
        return repository.findAll();
    }

    public Schedule getStudentById(Long id) {
        return repository.findById(id).orElse(null);
    }

    public String deleteStudent(Long id) {
        repository.deleteById(id);
        return "Schedule removed !! " + id;
    }

    public Schedule updateStudent(Schedule schedule,Long id) {
    	Schedule existingSchedule = repository.findById(id).orElse(null);
    	existingSchedule.setStatus(schedule.getStatus());
        return repository.save(existingSchedule);
    }


}