package com.onlinecoaching.controller;

import com.onlinecoaching.model.Course;
import com.onlinecoaching.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class BaseController {

    @Autowired
    private CourseService courseService;

    @GetMapping("/get/course")
    public List<Course> getCourses(){
        System.out.println("Here in base controller");
        return courseService.getCourses();
    }
}
