package lk.ijse.royal_institute.util;

import lk.ijse.royal_institute.entity.Course;
import lk.ijse.royal_institute.entity.Registration;
import lk.ijse.royal_institute.entity.Student;
import org.hibernate.SessionFactory;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

public class HibernateUtil {
    private static SessionFactory sessionFactory= buildSessionFactory();

    private static SessionFactory buildSessionFactory(){
        StandardServiceRegistry sReg=new StandardServiceRegistryBuilder().loadProperties("application.properties").build();
        Metadata mData= new MetadataSources(sReg)
               .addAnnotatedClass(Student.class)
               .addAnnotatedClass(Course.class)
               .addAnnotatedClass(Registration.class)
               .getMetadataBuilder().build();
        return mData.getSessionFactoryBuilder().build();

    }

    public static SessionFactory getSessionFactory() {
        return sessionFactory;
    }
}
