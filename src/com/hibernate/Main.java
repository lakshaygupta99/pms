package com.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

public class Main {
	public static void main(String[] args) {
		Doctor doctor = new Doctor();
		doctor.setName("Lakshay");
		Patient patient1 = new Patient();
		patient1.setName("ABC1");
		patient1.setDoctorDetails(doctor);
		
		Patient patient2 = new Patient();
		patient2.setName("AAA2");
		patient2.setDoctorDetails(doctor);
		(doctor.getPatients()).add(patient1);
		(doctor.getPatients()).add(patient2);
		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		session.save(doctor);
		session.getTransaction().commit();
		session.close();
		sessionFactory.close();
	}
}