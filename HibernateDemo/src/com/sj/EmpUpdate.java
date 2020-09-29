package com.sj;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class EmpUpdate {

	public static void main(String[] args) {
		
	
			SessionFactory factory = new Configuration().configure().buildSessionFactory();
			Session session=factory.openSession();
			Transaction tr = session.beginTransaction();
			
			//update
			Employee e2 = (Employee) session.load(Employee.class, 9);//displaying particular data(load keyword)
			
			e2.setName("lucky");
			session.update(e2);
			
			e2.setSal(60000);
			session.update(e2);
			
			System.out.println(e2);
			System.out.println("Record Updated");
			
			
			//delete
			Employee e1 = (Employee) session.load(Employee.class, 99);
		
			session.delete(e1);
			System.out.println("Record deleted");
			
			tr.commit();

	}
}