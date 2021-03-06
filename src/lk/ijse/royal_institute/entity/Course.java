package lk.ijse.royal_institute.entity;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Course {
    @Id
    private String courseCode;
    private String courseName;
    private String courseType;
    private String duration;

    @OneToMany(mappedBy = "course",cascade = CascadeType.ALL)
    private List<Registration> registrationArrayList=new ArrayList<>();



    public Course() {
    }

    public Course(String courseCode, String courseName, String courseType, String duration) {
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


    public List<Registration> getRegistrationArrayList() {
        return registrationArrayList;
    }

    public void setRegistrationArrayList(ArrayList<Registration> registrationArrayList) {
        this.registrationArrayList = registrationArrayList;
    }

}
