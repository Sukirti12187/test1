package com.sj;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.sj.Employee;

public class AddEmployee {

	public static void main(String[] args) {
	
		Session session = null;
		SessionFactory factory;
		
		try 
		{
			//creating configuration object  and creating session factory object  
			factory = new Configuration().configure().buildSessionFactory();
			
			//creating session object  
			session=factory.openSession();
			
			//creating transaction object 
			Transaction tr = session.beginTransaction();
			int id=Integer.parseInt(args[0]);
			int s1=Integer.parseInt(args[2]);
			
			Employee emp=new Employee(id,args[1],s1);
			session.save(emp);
			tr.commit();
			System.out.println("Record Added");
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		finally
		{
			System.out.println("in finally");
			session.flush();
			session.close();
			
		}
	}
}
