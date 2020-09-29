 package com.sj;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class EmpCrud {

	public static void main(String[] args) {
		
		Session session = null;
		SessionFactory factory;
			factory = new Configuration().configure().buildSessionFactory();
			session=factory.openSession();
			Transaction tr = session.beginTransaction();
			
			Employee e2 = (Employee) session.load(Employee.class,3);//displaying particular data(load keyword)
			System.out.println(e2);
			System.out.println("Record Displayed");
			
		
		
	}

}
