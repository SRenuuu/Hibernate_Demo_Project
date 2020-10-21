package lk.ijse.royal_institute.dto;

import lk.ijse.royal_institute.entity.Registration;

import java.util.ArrayList;
import java.util.Date;

public class StudentDTO {
    private String studentID;
    private String studentName;
    private String address;
    private String contactNo;
    private Date dob;
    private String gender;


    public StudentDTO() {
    }

    public StudentDTO(String studentID, String studentName, String address, String contactNo, Date dob, String gender) {
        this.studentID = studentID;
        this.studentName = studentName;
        this.address = address;
        this.contactNo = contactNo;
        this.dob = dob;
        this.gender = gender;
    }

    public String getStudentID() {
        return studentID;
    }

    public void setStudentID(String studentID) {
        this.studentID = studentID;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getContactNo() {
        return contactNo;
    }

    public void setContactNo(String contactNo) {
        this.contactNo = contactNo;
    }

    public Date getDob() {
        return dob;
    }

    public void setDob(Date dob) {
        this.dob = dob;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }


}
