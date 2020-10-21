package lk.ijse.royal_institute.dao.custom.impl;

import lk.ijse.royal_institute.dao.custom.CourseDAO;
import lk.ijse.royal_institute.entity.Course;
import lk.ijse.royal_institute.util.HibernateUtil;
import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;
import org.hibernate.transform.Transformers;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class CourseDAOImpl implements CourseDAO {
    @Override
    public boolean add(Course enty) throws ClassNotFoundException, HibernateException {
        Transaction tx=null;
        try(Session session= HibernateUtil.getSessionFactory().openSession()){
            tx=session.beginTransaction();
            session.save(enty);
            tx.commit();
            return true;
        }catch (Throwable t){
            //tx.rollback();
            t.printStackTrace();
            return false;
        }
    }

    @Override
    public boolean update(Course enty) throws ClassNotFoundException, HibernateException {
        Transaction tx=null;
        try(Session session= HibernateUtil.getSessionFactory().openSession()){
            tx=session.beginTransaction();
            session.update(enty);
            tx.commit();
            return true;
        }catch (Throwable e){
            tx.rollback();
            return false;
        }
    }


    @Override
    public boolean delete(String s) throws ClassNotFoundException, HibernateException {
        Transaction tx=null;
        try(Session session= HibernateUtil.getSessionFactory().openSession()){
            tx=session.beginTransaction();
            session.delete(new Course(s,"","",""));
            tx.commit();
            return true;
        }catch (Throwable e){
            tx.rollback();
            return false;
        }
    }

    @Override
    public ArrayList<Course> getAll() throws ClassNotFoundException, HibernateException {
        try(Session session= HibernateUtil.getSessionFactory().openSession()) {
            Query query = session.createNativeQuery("SELECT * FROM course;");
            query.setResultTransformer(Transformers.aliasToBean(Course.class));
            ArrayList<Course> courses = (ArrayList<Course>) query.getResultList();
            return courses;
        }catch (Exception e){
            return null;
        }

    }
}
