package lk.ijse.royal_institute.dao.custom.impl;

import lk.ijse.royal_institute.dao.QueryDAO;
import lk.ijse.royal_institute.entity.Query;
import lk.ijse.royal_institute.util.HibernateUtil;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.transform.Transformers;

import java.util.ArrayList;

public class QueryDAOImpl implements QueryDAO {

    @Override
    public ArrayList<Query> getAll() throws ClassNotFoundException, HibernateException {
        try(Session session= HibernateUtil.getSessionFactory().openSession()) {
//
//            List<Object[]> queries = session.createQuery(
//                    SELECT regNo,regDate,regFee,course.courseCode, courseName,student.studentID,studentName FROM registration INNER JOIN student ON registration.student_id=student.studentID INNER JOIN course ON registration.course_code=course.courseCode;"))
//                    .list();

            org.hibernate.query.Query query = session.createNativeQuery("SELECT regNo,regDate,regFee,course.courseCode, courseName,student.studentID,studentName FROM registration INNER JOIN student ON registration.student_id=student.studentID INNER JOIN course ON registration.course_code=course.courseCode;");
            query.setResultTransformer(Transformers.aliasToBean(Query.class));
            ArrayList<Query> queries = (ArrayList<Query>) query.getResultList();
            return queries;
        }catch (Exception e){
            return null;
        }
    }
}