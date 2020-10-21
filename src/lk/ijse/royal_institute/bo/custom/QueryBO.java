package lk.ijse.royal_institute.bo.custom;

import lk.ijse.royal_institute.bo.SuperBO;
import lk.ijse.royal_institute.dto.StudentDTO;
import lk.ijse.royal_institute.entity.QueryDTO;
import org.hibernate.HibernateException;

import java.util.ArrayList;

public interface QueryBO extends SuperBO {
    public ArrayList<QueryDTO> getAllQueries() throws ClassNotFoundException, HibernateException;

}
