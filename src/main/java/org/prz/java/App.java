package org.prz.java;

/**
 * Hello world!
 *
 */

import org.hibernate.HibernateException;
import org.hibernate.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.persistence.User;

@SuppressWarnings("deprecation")
public class App 
{
	
    @SuppressWarnings("deprecation")
	public static void main( String[] args ) {
    	
    	addUser("dupa2", "slonia2");
    }
    
    
    public static void addUser(String name, String lastname ) {
    	
    	Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction tx = null;

        try {
           tx = session.beginTransaction();
           
           User user = new User();
           user.setFirstName(name);
           user.setLastName(lastname);
           session.save(user);
           
           tx.commit();
        } catch (HibernateException e) {
           if (tx!=null) tx.rollback();
           e.printStackTrace(); 
        } finally {
           session.close(); 
        }
    }
    
}
