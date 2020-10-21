package lk.ijse.royal_institute.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import java.util.Date;

@Entity
public class Query {
    @Id
    private String regNo;
    private Date regDate;
    private double regFee;
    private String courseCode;
    private String courseName;
    private String studentID;
    private String studentName;

    public Query() {
    }

    public Query(String regNo, Date regDate, double regFee, String courseCode, String courseName, String studentID, String studentName) {
        this.regNo = regNo;
        this.regDate = regDate;
        this.regFee = regFee;
        this.courseCode = courseCode;
        this.courseName = courseName;
        this.studentID = studentID;
        this.studentName = studentName;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
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

    public String getCourseCode() {
        return courseCode;
    }

    public void setCourseCode(String courseCode) {
        this.courseCode = courseCode;
    }

    public String getStudentID() {
        return studentID;
    }

    public void setStudentID(String studentID) {
        this.studentID = studentID;
    }
}