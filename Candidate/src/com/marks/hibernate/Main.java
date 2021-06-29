package com.marks.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;

@SuppressWarnings("deprecation")
public class Main {

	public static void main(String[] args) {
		
		CandidateInfo candidate1 = new CandidateInfo();
		candidate1.setFname("Kunal");
		candidate1.setLname("Naik");
		
		CandidatePoints points1 = new CandidatePoints();

		points1.setTotal(false, true, true, false);
		
		points1.setCandidate(candidate1);
		
		CandidateInfo candidate2 = new CandidateInfo();
		candidate2.setFname("Jayesh");
		candidate2.setLname("Palkar");
		
		CandidatePoints points2 = new CandidatePoints();

		points2.setTotal(true, true, false, true);
		
		points2.setCandidate(candidate2);
		
		SessionFactory sessionFactory = new AnnotationConfiguration().configure().buildSessionFactory();
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		
		session.save(points1);
		session.save(points2);
		
		session.getTransaction().commit();
		session.close();
		sessionFactory.close();
	}

}
