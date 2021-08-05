package com.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

public class UpdatePatient {

	public static void main(String[] args) {
		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		Patient student = (Patient) session.get(Patient.class, 2);
		student.setName("Ishu22"); // update where id=2
		System.out.println("Updated Successfully");
		session.getTransaction().commit();
		sessionFactory.close();
		student.setName("Ishu72"); // update where id=2
	}

}
