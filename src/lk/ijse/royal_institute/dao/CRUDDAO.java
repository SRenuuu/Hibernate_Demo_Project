package lk.ijse.royal_institute.dao;

import lk.ijse.royal_institute.dto.StudentDTO;
import org.hibernate.HibernateException;

import java.util.ArrayList;

public interface CRUDDAO<T,ID> extends SuperDAO{
    public boolean add(T enty) throws ClassNotFoundException, HibernateException;
    public boolean update(T enty) throws ClassNotFoundException, HibernateException;
    public boolean delete(ID id) throws ClassNotFoundException, HibernateException;

}
