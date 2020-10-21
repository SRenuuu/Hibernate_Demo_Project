package lk.ijse.royal_institute.bo.custom.impl;

import lk.ijse.royal_institute.bo.custom.RegistrationBO;
import lk.ijse.royal_institute.dao.DAOFactory;
import lk.ijse.royal_institute.dao.custom.CourseDAO;
import lk.ijse.royal_institute.dao.custom.RegistrationDAO;
import lk.ijse.royal_institute.dao.custom.StudentDAO;
import lk.ijse.royal_institute.dto.CourseDTO;
import lk.ijse.royal_institute.dto.RegistrationDTO;
import lk.ijse.royal_institute.dto.StudentDTO;
import lk.ijse.royal_institute.entity.Course;
import lk.ijse.royal_institute.entity.Registration;
import lk.ijse.royal_institute.entity.Student;
import org.hibernate.HibernateException;

import java.util.ArrayList;

public class RegistrationBOImpl implements RegistrationBO {
    CourseDAO dao1 = (CourseDAO) DAOFactory.getInstance().getDAO(DAOFactory.DAOTypes.COURSE);
    StudentDAO dao2 = (StudentDAO) DAOFactory.getInstance().getDAO(DAOFactory.DAOTypes.STUDENT);
    RegistrationDAO dao = (RegistrationDAO) DAOFactory.getInstance().getDAO(DAOFactory.DAOTypes.REGISTRATION);

    @Override
    public boolean addRegistration(RegistrationDTO registration) throws ClassNotFoundException, HibernateException {
        System.out.println("2 step");
        System.out.println(registration.getStudent().getStudentID());

        System.out.println(registration.getCourse().getCourseCode());
        Registration registration1 = new Registration(registration.getRegNo(),
                registration.getRegDate(),
                registration.getRegFee(),

                new Student(registration.getStudent().getStudentID(),
                        registration.getStudent().getStudentName(),
                        registration.getStudent().getAddress(),
                        registration.getStudent().getContactNo(),
                        registration.getStudent().getDob(),
                        registration.getStudent().getGender()),

                new Course(registration.getCourse().getCourseCode(),
                        registration.getCourse().getCourseName(),
                        registration.getCourse().getCourseType(),
                        registration.getCourse().getDuration()
                )
        );
        System.out.println("registration1 = " + registration1);
        return dao.add(registration1);
    }

    @Override
    public boolean editRegistration(RegistrationDTO registration) throws ClassNotFoundException, HibernateException {
        return dao.update(new Registration(registration.getRegNo(), registration.getRegDate(), registration.getRegFee(),
                new Student(registration.getStudent().getStudentID(),
                        registration.getStudent().getStudentName(),
                        registration.getStudent().getAddress(),
                        registration.getStudent().getContactNo(),
                        registration.getStudent().getDob(),
                        registration.getStudent().getGender()),
                new Course(registration.getCourse().getCourseCode(),
                        registration.getCourse().getCourseName(),
                        registration.getCourse().getCourseType(),
                        registration.getCourse().getDuration()
                )));
    }

    @Override
    public boolean removeRegistration(String registrationID) throws ClassNotFoundException, HibernateException {
        return dao.delete(registrationID);
    }


}
