package co.com.biblio.util;

import java.io.File;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import org.hibernate.cfg.Configuration;

public class HibernateUtil {
	private static SessionFactory sessionFactory; 
	
	
    private static SessionFactory buildSessionFactory() {
        
    	
    	try {
    		sessionFactory = new Configuration().configure().buildSessionFactory();
         } catch (Throwable ex) { 
            System.err.println("Failed to create sessionFactory object." + ex);
            throw new ExceptionInInitializerError(ex); 
         }
    	
    	
    	 return sessionFactory;
    	
      
    }
 
    public static SessionFactory getSessionFactory() {
        return sessionFactory;
    }
 
    public static Session getSession() throws HibernateException {
		Session session;
		session = getSessionFactory().openSession();
		return session;
    }
}
