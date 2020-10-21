package lk.ijse.royal_institute.bo.custom.impl;

import lk.ijse.royal_institute.bo.custom.QueryBO;
import lk.ijse.royal_institute.bo.custom.RegistrationBO;
import lk.ijse.royal_institute.dao.DAOFactory;
import lk.ijse.royal_institute.dao.QueryDAO;
import lk.ijse.royal_institute.dao.custom.CourseDAO;
import lk.ijse.royal_institute.dao.custom.RegistrationDAO;
import lk.ijse.royal_institute.dao.custom.StudentDAO;
import lk.ijse.royal_institute.dto.CourseDTO;
import lk.ijse.royal_institute.dto.RegistrationDTO;
import lk.ijse.royal_institute.dto.StudentDTO;
import lk.ijse.royal_institute.entity.*;
import lk.ijse.royal_institute.entity.QueryDTO;
import org.hibernate.HibernateException;

import java.util.ArrayList;

public class QueryBOImpl implements QueryBO {
    QueryDAO dao = (QueryDAO) DAOFactory.getInstance().getDAO(DAOFactory.DAOTypes.QUERY);

    @Override
    public ArrayList<QueryDTO> getAllQueries() throws ClassNotFoundException, HibernateException {
        ArrayList<Query> all = dao.getAll();
        ArrayList<QueryDTO> allQuery = new ArrayList<>();
        for (Query q : all) {
            allQuery.add(new QueryDTO(q.getRegNo(),q.getRegDate(),q.getRegFee(),q.getCourseCode(),q.getCourseName(),q.getStudentID(),q.getStudentName()));
        }
        return allQuery;
    }
}
