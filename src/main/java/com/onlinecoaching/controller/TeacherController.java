package com.onlinecoaching.controller;

import com.onlinecoaching.model.Teacher;
import com.onlinecoaching.service.TeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/teacher")
public class TeacherController {

    @Autowired
    TeacherService teacherService;
    
    @PostMapping(value = "/add/", produces = "application/json")
    public List<Teacher> addTeachers(@RequestBody Teacher teacher){
        System.out.println("teacher");

        return teacherService.addTeacher(teacher);
    }
}
