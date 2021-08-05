package com.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

public class DeletePatient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
		// getting session object from session factory
		Session session = sessionFactory.openSession();
		// getting transaction object from session object
		session.beginTransaction();
		Patient student = (Patient) session.load(Patient.class, 5);// delete where id=2
		session.delete(student);
		System.out.println("Deleted Successfully");
		session.getTransaction().commit();
		sessionFactory.close();
	}

}
