package com.onlinecoaching.service;

import com.onlinecoaching.exception.ResourceExistsException;
import com.onlinecoaching.model.Course;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CourseSeviceImpl implements CourseService {


    private  List<Course> allCourse = new ArrayList<>();

    @Override
    public List<Course> getCourses() {
        return allCourse;
    }

    @Override
    public List<Course> addCourse(Course course){

        if(allCourse.stream().anyMatch(c -> c.getCourseName().equals(course.getCourseName()))){
            throw new ResourceExistsException("Course already exists", "TECHNICAL_ERROR");
        }

        allCourse.add(course);

        return allCourse;
    }
}
