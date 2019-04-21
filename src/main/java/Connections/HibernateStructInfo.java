package Connections;

import java.io.File;
import java.sql.Connection;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public abstract class HibernateStructInfo  {

    static final Logger LOG = LoggerFactory.getLogger(HibernateStructInfo.class);

    protected static Session session;
    protected static Transaction tx = null;
    protected static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
    protected static final String DB_URL = "jdbc:mysql://localhost/wodi";
    protected static final String USER = "root";
    protected static final String PASS = "root";
    protected static Connection conn ;
    protected static SessionFactory sessionFactory ;

    public HibernateStructInfo() {
        File cfgxml = new File("E://WodiProject/src/main/resources/hibernate.cfg.xml");
        sessionFactory = new Configuration().configure(cfgxml).buildSessionFactory();
        session = getSession();

    }

    public static Session getSession() {
        return sessionFactory.openSession() ;
    }

    public static void saveObject(Object object)
    {
        Session session = null ;
        session = getTheSession(session);
        beginTransaction(session);
        saveObject(object, session);
        getTransaction(session);
    }


    public static ObjectSession beginTranscation()
    {
        ObjectSession objectSession =  new ObjectSession();
        try{
            tx = session.beginTransaction();
            objectSession.setSession(session);
            objectSession.setTx(tx);
        }catch (HibernateException e) {
            if (tx!=null) tx.rollback();
            e.printStackTrace();
        }
        return objectSession;

    }
    public static void getTransaction(Session session) {
        try {
            session.getTransaction().commit();
        }
        catch (Exception e)  {
            System.out.println("failed to commit");
            e.printStackTrace();
        }
    }

    public static void saveObject(Object object, Session session) {
        try {
            session.save(object);
        }
        catch (Exception e)  {
            System.out.println("failed to save object");
            e.printStackTrace();
        }
    }

    public static void beginTransaction(Session session) {
        try {
            session.beginTransaction();
        }
        catch (Exception e)  {
            System.out.println("failed to begin transaction");
            e.printStackTrace();
        }
    }

    public static Session getTheSession(Session session) {
        try {
            session = getSession() ;
        }
        catch (Exception e)  {
            System.out.println("failed to get session");
            e.printStackTrace();
        }
        return session;
    }


    public void updateAndCommit(String query){
        Session s = null;
        try {
            s.getTransaction().begin();
            s.createSQLQuery(query).executeUpdate();
            s.getTransaction().commit();
            s.close();
        }
        catch (HibernateException erro){
            s.getTransaction().rollback();
            s.close();
        }
    }

    public void saveOrUpdate(Object object) {
        session.saveOrUpdate(object);
        tx.commit();
    }



}
