package lk.ijse.royal_institute.bo.custom;

import lk.ijse.royal_institute.bo.SuperBO;
import lk.ijse.royal_institute.dto.RegistrationDTO;
import org.hibernate.HibernateException;

import java.util.ArrayList;

public interface RegistrationBO extends SuperBO {
    public boolean addRegistration(RegistrationDTO registration) throws ClassNotFoundException, HibernateException;
    public boolean editRegistration(RegistrationDTO registration) throws ClassNotFoundException, HibernateException;
    public boolean removeRegistration(String registrationID) throws ClassNotFoundException, HibernateException;


}
