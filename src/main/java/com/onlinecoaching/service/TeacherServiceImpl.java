package com.onlinecoaching.service;

import com.onlinecoaching.exception.ResourceExistsException;
import com.onlinecoaching.model.Course;
import com.onlinecoaching.model.Teacher;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class TeacherServiceImpl implements TeacherService {

    @Autowired
    private CourseService courseService;

    List<Teacher> teachers = new ArrayList<>();

    @Override
    public List<Teacher> addTeacher(Teacher teacher) {

        List<Course> allCourse = courseService.getCourses();

        if(teachers.stream().anyMatch(t -> t.getPhoneNo().equals(teacher.getPhoneNo()))){
            throw new ResourceExistsException("Teacher already enrolled", "TECHNICAL_ERROR");
        }
        List<String> courseOffered = teacher.getCourseOffered();
        for(String s: courseOffered){
            if(!allCourse.stream().anyMatch(c -> c.getCourseName().equals(s))){
                throw new ResourceExistsException("unknown Course", "TECHNICAL_ERROR");
            }

        }
        if(!allCourse.stream().anyMatch(c -> c.getCouseSkills().equals(teacher.getSkillSet()))){
            throw new ResourceExistsException("Teacher not eligible to offer the course", "T");
        }

        teachers.add(teacher);
        return teachers;
    }
}
