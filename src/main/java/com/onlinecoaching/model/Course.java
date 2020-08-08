package com.onlinecoaching.model;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.springframework.stereotype.Component;

@Component
public class Course {

    @JsonProperty("name")
    private String courseName;
    @JsonProperty("level")
    private String courseLevel;
    @JsonProperty("durationInMinutes")
    private String duration;
    @JsonProperty("prerequisite")
    private String couseSkills;



    //@JsonGetter("name")
    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getCourseLevel() {
        return courseLevel;
    }

    public void setCourseLevel(String courseLevel) {
        this.courseLevel = courseLevel;
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    public String getCouseSkills() {
        return couseSkills;
    }

    public void setCouseSkills(String couseSkills) {
        this.couseSkills = couseSkills;
    }
}
