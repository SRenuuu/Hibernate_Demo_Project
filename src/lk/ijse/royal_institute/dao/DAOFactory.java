package lk.ijse.royal_institute.dao;

import lk.ijse.royal_institute.dao.custom.RegistrationDAO;
import lk.ijse.royal_institute.dao.custom.impl.CourseDAOImpl;
import lk.ijse.royal_institute.dao.custom.impl.QueryDAOImpl;
import lk.ijse.royal_institute.dao.custom.impl.RegistrationDAOImpl;
import lk.ijse.royal_institute.dao.custom.impl.StudentDAOImpl;

public class DAOFactory {
    private static DAOFactory daoFactory;

    public DAOFactory() {
    }

    public static DAOFactory getInstance(){
        if(daoFactory==null){
            daoFactory=new DAOFactory();
        }
        return daoFactory;
    }

    public enum DAOTypes{
        STUDENT, COURSE, REGISTRATION,QUERY;
    }

    public SuperDAO getDAO(DAOTypes types){
        switch(types){
            case STUDENT:
                return new StudentDAOImpl();
            case COURSE:
                return new CourseDAOImpl();
            case REGISTRATION:
                return new RegistrationDAOImpl();
            case QUERY:
                return new QueryDAOImpl();

            default: return null;

        }
    }


}
