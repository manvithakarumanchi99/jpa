package com.lti.ui;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.lti.model.student;

public class Main {

	public static void main(String[] args) {
		
		// new state
		student stu = new student(44, "manvitha", 56.5);
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("JPA_PU");
		EntityManager entityManager = factory.createEntityManager();
		entityManager.getTransaction().begin();
		
		// attached or managed
		entityManager.persist(stu);
		entityManager.getTransaction().commit();

		// attached or managed
		student student2 = entityManager.find(student.class, stu.getRollNumber());
		System.out.println(student2);
		
		// detached
		entityManager.clear();
		entityManager.getTransaction().begin();
		student2.setStudentName("karumanchi");
		entityManager.merge(student2);
		entityManager.getTransaction().commit();

		// attached or managed
		 student2 = entityManager.find(student.class, stu.getRollNumber());
		System.out.println(student2);
		entityManager.getTransaction().begin();

		// removed
		entityManager.remove(student2);
		entityManager.getTransaction().commit();
		 student2 = entityManager.find(student.class, stu.getRollNumber());
		System.out.println(student2);

	}

}
