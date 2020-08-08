package com.onlinecoaching.controller;

import com.onlinecoaching.model.Course;
import com.onlinecoaching.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/course")
public class CourseController {

    @Autowired
    private CourseService service;

    @PostMapping(value = "/add/", produces = "application/json")
    public List<Course> addCourse(@RequestBody Course course){
        return service.addCourse(course);

    }

}
