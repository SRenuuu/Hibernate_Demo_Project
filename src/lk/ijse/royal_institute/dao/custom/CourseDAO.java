package lk.ijse.royal_institute.dao.custom;

import lk.ijse.royal_institute.dao.CRUDDAO;
import lk.ijse.royal_institute.entity.Course;
import org.hibernate.HibernateException;

import java.util.ArrayList;

public interface CourseDAO extends CRUDDAO<Course,String> {
    public ArrayList<Course> getAll() throws ClassNotFoundException, HibernateException;
}
