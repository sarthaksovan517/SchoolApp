package com.onlinecoaching.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class Teacher {
    @JsonProperty("name")
    private String name;
    @JsonProperty("email")
    private String email;
    @JsonProperty("phone")
    private String phoneNo;
    @JsonProperty("qualification")
    private String qualification;
    @JsonProperty("exp")
    private String exp;
    @JsonProperty("graduatedIn")
    private String skillSet;
    @JsonProperty("coursesOffered")
    private List<String> courseOffered;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNo() {
        return phoneNo;
    }

    public void setPhoneNo(String phoneNo) {
        this.phoneNo = phoneNo;
    }

    public String getQualification() {
        return qualification;
    }

    public void setQualification(String qualification) {
        this.qualification = qualification;
    }

    public String getExp() {
        return exp;
    }

    public void setExp(String exp) {
        this.exp = exp;
    }

    public String getSkillSet() {
        return skillSet;
    }

    public void setSkillSet(String skillSet) {
        this.skillSet = skillSet;
    }

    public List<String> getCourseOffered() {
        return courseOffered;
    }

    public void setCourseOffered(List<String> courseOffered) {
        this.courseOffered = courseOffered;
    }
}
