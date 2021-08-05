package com.hibernate;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

public class ReadPatient {
	public static void main(String [] args) {
		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
		// getting session object from session factory
		Session session = sessionFactory.openSession();
		// getting transaction object from session object
		session.beginTransaction();
		List<Patient> students = new ArrayList<Patient>();
		for (Object oneObject : session.createQuery("FROM Patient").getResultList()) {
			students.add((Patient) oneObject);
		}
		for (Patient student : students) {
			System.out.println("Name: " + student.getName());
		}
		session.getTransaction().commit();
		sessionFactory.close();
	}
	
}
