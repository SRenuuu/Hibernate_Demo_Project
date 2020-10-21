package lk.ijse.royal_institute.bo.custom;

import lk.ijse.royal_institute.bo.SuperBO;
import lk.ijse.royal_institute.dto.StudentDTO;
import org.hibernate.HibernateException;

import java.util.ArrayList;

public interface StudentBO extends SuperBO {
    public boolean addStudent(StudentDTO student) throws ClassNotFoundException, HibernateException;
    public boolean editStudent(StudentDTO student) throws ClassNotFoundException, HibernateException;
    public boolean removeStudent(String studentID) throws ClassNotFoundException, HibernateException;

}
