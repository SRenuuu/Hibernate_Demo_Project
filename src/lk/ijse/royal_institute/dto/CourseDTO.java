package lk.ijse.royal_institute.dto;

import lk.ijse.royal_institute.entity.Registration;

import java.util.ArrayList;

public class CourseDTO {
    private String courseCode;
    private String courseName;
    private String courseType;
    private String duration;


    public CourseDTO() {
    }

    public CourseDTO(String courseCode, String courseName, String courseType, String duration) {
        this.courseCode = courseCode;
        this.courseName = courseName;
        this.courseType = courseType;
        this.duration = duration;
    }

    public String getCourseCode() {
        return courseCode;
    }

    public void setCourseCode(String courseCode) {
        this.courseCode = courseCode;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getCourseType() {
        return courseType;
    }

    public void setCourseType(String courseType) {
        this.courseType = courseType;
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }


}
