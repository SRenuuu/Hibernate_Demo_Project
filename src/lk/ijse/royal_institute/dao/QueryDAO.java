package lk.ijse.royal_institute.dao;

import lk.ijse.royal_institute.entity.Query;
import org.hibernate.HibernateException;

import java.util.ArrayList;

public interface QueryDAO extends SuperDAO{
    public ArrayList<Query> getAll() throws ClassNotFoundException, HibernateException;
}
