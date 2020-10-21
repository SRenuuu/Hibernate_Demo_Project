package lk.ijse.royal_institute.dao.custom.impl;

import lk.ijse.royal_institute.dao.custom.RegistrationDAO;
import lk.ijse.royal_institute.entity.Course;
import lk.ijse.royal_institute.entity.Registration;
import lk.ijse.royal_institute.util.HibernateUtil;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;
import org.hibernate.transform.Transformers;

import java.util.ArrayList;

public class RegistrationDAOImpl implements RegistrationDAO {
    @Override
   public boolean add(Registration enty) throws ClassNotFoundException, HibernateException {

//        System.out.println(enty.getStudent().getStudentID());
//
//        System.out.println(enty.getCourse().getCourseCode());

        Transaction tx=null;
        try(Session session= HibernateUtil.getSessionFactory().openSession()){
            tx=session.beginTransaction();
            session.save(enty.getStudent());
            //session.save(enty.getCourse());
            session.save(enty);
            tx.commit();
            return true;

        }catch (Throwable t) {
            //tx.rollback();
            t.printStackTrace();
            return false;
        }
    }
    @Override
    public boolean update(Registration enty) throws ClassNotFoundException, HibernateException {
        return false;
    }

    @Override
    public boolean delete(String s) throws ClassNotFoundException, HibernateException {
        return false;
    }

 }

