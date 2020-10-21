package lk.ijse.royal_institute.bo.custom.impl;

import lk.ijse.royal_institute.bo.custom.CourseBO;
import lk.ijse.royal_institute.dao.DAOFactory;
import lk.ijse.royal_institute.dao.custom.CourseDAO;
import lk.ijse.royal_institute.dto.CourseDTO;
import lk.ijse.royal_institute.dto.StudentDTO;
import lk.ijse.royal_institute.entity.Course;
import org.hibernate.HibernateException;

import java.util.ArrayList;

public class CourseBOImpl implements CourseBO {
    CourseDAO dao= (CourseDAO) DAOFactory.getInstance().getDAO(DAOFactory.DAOTypes.COURSE);

    @Override
    public boolean addCourse(CourseDTO course) throws ClassNotFoundException, HibernateException {
        //System.out.println("BO Impl Enty "+course.getCourseName());
        return dao.add(new Course(course.getCourseCode(),course.getCourseName(),course.getCourseType(),course.getDuration()));
    }

    @Override
    public boolean editCourse(CourseDTO course) throws ClassNotFoundException, HibernateException {
        return dao.update(new Course(course.getCourseCode(),course.getCourseName(),course.getCourseType(),course.getDuration()));
    }

    @Override
    public boolean removeCourse(String courseCode) throws ClassNotFoundException, HibernateException {
        return dao.delete(courseCode);
    }

    @Override
    public ArrayList<CourseDTO> getAllCourses() throws ClassNotFoundException, HibernateException {
        ArrayList<Course> all=dao.getAll();
        ArrayList<CourseDTO> allCourses=new ArrayList<>();
        for(Course c:all){
            allCourses.add(new CourseDTO(c.getCourseCode(),c.getCourseName(),c.getCourseType(),c.getDuration()));
        }
        return allCourses;
    }
}
