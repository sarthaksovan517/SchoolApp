package com.onlinecoaching.service;

import com.onlinecoaching.model.Course;

import java.util.List;

public interface CourseService {

    public List<Course> getCourses();
    public List<Course> addCourse(Course course);
}
