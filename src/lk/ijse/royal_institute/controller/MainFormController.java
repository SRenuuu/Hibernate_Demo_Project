package lk.ijse.royal_institute.controller;

import lk.ijse.royal_institute.bo.BOFactory;
import lk.ijse.royal_institute.bo.custom.CourseBO;
import lk.ijse.royal_institute.bo.custom.QueryBO;
import lk.ijse.royal_institute.bo.custom.RegistrationBO;
import lk.ijse.royal_institute.bo.custom.StudentBO;
import lk.ijse.royal_institute.dto.CourseDTO;
import lk.ijse.royal_institute.dto.RegistrationDTO;
import lk.ijse.royal_institute.entity.QueryDTO;
import org.hibernate.HibernateException;

import java.util.ArrayList;

public class MainFormController {

    CourseBO bo1= (CourseBO) BOFactory.getInstance().getBO(BOFactory.BOTypes.COURSE);
    RegistrationBO bo2 = (RegistrationBO) BOFactory.getInstance().getBO(BOFactory.BOTypes.REGISTRATION);
    StudentBO bo3= (StudentBO) BOFactory.getInstance().getBO(BOFactory.BOTypes.STUDENT);
    QueryBO bo4= (QueryBO) BOFactory.getInstance().getBO(BOFactory.BOTypes.QUERY);


    public boolean addCourse(CourseDTO newCourse) throws ClassNotFoundException, HibernateException {
        //System.out.println("Controller "+newCourse.getCourseName());
        return bo1.addCourse(newCourse);

    }

    public ArrayList<CourseDTO> getAllCourses() throws ClassNotFoundException, HibernateException {
        return bo1.getAllCourses();
    }

    public boolean addRegistration(RegistrationDTO newRegistration) throws ClassNotFoundException, HibernateException  {
        System.out.println(newRegistration.getStudent().getStudentID());

        System.out.println(newRegistration.getCourse().getCourseCode());
        return bo2.addRegistration(newRegistration);

    }

    public ArrayList<QueryDTO> getAllRegistrations() throws ClassNotFoundException, HibernateException {
        return bo4.getAllQueries();

    }
}
