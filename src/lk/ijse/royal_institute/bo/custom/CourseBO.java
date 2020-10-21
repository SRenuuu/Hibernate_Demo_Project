package lk.ijse.royal_institute.bo.custom;

import lk.ijse.royal_institute.bo.SuperBO;
import lk.ijse.royal_institute.dto.CourseDTO;
import org.hibernate.HibernateException;

import java.util.ArrayList;

public interface CourseBO extends SuperBO {
    public boolean addCourse(CourseDTO course) throws ClassNotFoundException, HibernateException;
    public boolean editCourse(CourseDTO course) throws ClassNotFoundException, HibernateException;
    public boolean removeCourse(String courseCode) throws ClassNotFoundException, HibernateException;
    public ArrayList<CourseDTO> getAllCourses() throws ClassNotFoundException, HibernateException;

}
