package lk.ijse.royal_institute.entity;

import lk.ijse.royal_institute.dto.CourseDTO;

import javax.persistence.*;
import java.util.Date;

@Entity
public class Registration {
    @Id
    private String regNo;
    private Date regDate;
    private double regFee;

    @ManyToOne
    @JoinColumn(name = "student_id", referencedColumnName = "studentID",nullable = true)
    private Student student;


    @ManyToOne
    @JoinColumn(name = "course_code", referencedColumnName = "courseCode",nullable = true)
    private Course course;

    public Registration() {
    }

    public Registration(String regNo, Date regDate, double regFee, Student student, Course course) {
        this.regNo = regNo;
        this.regDate = regDate;
        this.regFee = regFee;
        this.student = student;
        this.course = course;
    }

    public String getRegNo() {
        return regNo;
    }

    public void setRegNo(String regNo) {
        this.regNo = regNo;
    }

    public Date getRegDate() {
        return regDate;
    }

    public void setRegDate(Date regDate) {
        this.regDate = regDate;
    }

    public double getRegFee() {
        return regFee;
    }

    public void setRegFee(double regFee) {
        this.regFee = regFee;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }

    @Override
    public String toString() {
        return "Registration{" +
                "regNo='" + regNo + '\'' +
                ", regDate=" + regDate +
                ", regFee=" + regFee +
                ", student=" + student +
                ", course=" + course +
                '}';
    }
}
