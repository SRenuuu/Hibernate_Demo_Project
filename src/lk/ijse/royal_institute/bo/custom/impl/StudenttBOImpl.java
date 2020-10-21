package lk.ijse.royal_institute.bo.custom.impl;

import lk.ijse.royal_institute.bo.custom.StudentBO;
import lk.ijse.royal_institute.dao.DAOFactory;
import lk.ijse.royal_institute.dao.custom.StudentDAO;
import lk.ijse.royal_institute.dao.custom.impl.StudentDAOImpl;
import lk.ijse.royal_institute.dto.StudentDTO;
import lk.ijse.royal_institute.entity.Student;
import org.hibernate.HibernateException;

import java.util.ArrayList;

public class StudenttBOImpl implements StudentBO {
    StudentDAO dao= (StudentDAO) DAOFactory.getInstance().getDAO(DAOFactory.DAOTypes.STUDENT);

    @Override
    public boolean addStudent(StudentDTO student) throws ClassNotFoundException, HibernateException {
        return dao.add(new Student(student.getStudentID(),student.getStudentName(),student.getAddress(),student.getContactNo(),student.getDob(),student.getGender()));
    }

    @Override
    public boolean editStudent(StudentDTO student) throws ClassNotFoundException, HibernateException {
        return dao.update(new Student(student.getStudentID(),student.getStudentName(),student.getAddress(),student.getContactNo(),student.getDob(),student.getGender()));
    }

    @Override
    public boolean removeStudent(String studentID) throws ClassNotFoundException, HibernateException {
        return dao.delete(studentID);
    }


}
