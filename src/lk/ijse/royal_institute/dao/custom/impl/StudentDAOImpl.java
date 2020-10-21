package lk.ijse.royal_institute.dao.custom.impl;

import lk.ijse.royal_institute.dao.custom.StudentDAO;
import lk.ijse.royal_institute.entity.Student;
import lk.ijse.royal_institute.util.HibernateUtil;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.ArrayList;

public class StudentDAOImpl implements StudentDAO {
    @Override
   public boolean add(Student enty) throws ClassNotFoundException, HibernateException {
//        Transaction tx=null;
//        try(Session session= HibernateUtil.getSessionFactory().openSession()){
//            tx=session.beginTransaction();
//            session.save(enty);
//            tx.commit();
//        }catch ()





        return false;
    }

    @Override
    public boolean update(Student enty) throws ClassNotFoundException, HibernateException {
        return false;
    }

    @Override
    public boolean delete(String s) throws ClassNotFoundException, HibernateException {
        return false;
    }

}
