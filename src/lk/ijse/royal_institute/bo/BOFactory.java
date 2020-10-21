package lk.ijse.royal_institute.bo;

import lk.ijse.royal_institute.bo.custom.impl.CourseBOImpl;
import lk.ijse.royal_institute.bo.custom.impl.QueryBOImpl;
import lk.ijse.royal_institute.bo.custom.impl.RegistrationBOImpl;
import lk.ijse.royal_institute.bo.custom.impl.StudenttBOImpl;

public class BOFactory {
    private static BOFactory boFactory;

    public BOFactory() {
    }
    public static BOFactory getInstance(){
        if(boFactory==null){
            boFactory=new BOFactory();
        }
        return boFactory;

    }
    public enum BOTypes{
        STUDENT,COURSE,REGISTRATION,QUERY
    }

    public SuperBO getBO(BOTypes types){
        switch (types){
            case STUDENT:
                return new StudenttBOImpl();
            case COURSE:
                return new CourseBOImpl();
            case REGISTRATION:
                return new RegistrationBOImpl();
            case QUERY:
                return new QueryBOImpl();
            default: return null;

        }
    }

}
