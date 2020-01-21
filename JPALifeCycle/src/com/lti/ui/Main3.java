package com.lti.ui;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.lti.model.student;

public class Main3 {

	public static void main(String[] args) {

		// new state
		student stu = new student(100, "manvitha", 56.5);
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("JPA_PU");
		EntityManager entityManager = factory.createEntityManager();
		entityManager.getTransaction().begin();
		
		// attached or managed
		stu=entityManager.find(student.class, 100);
		entityManager.remove(stu);
		entityManager.getTransaction().commit();
		System.out.println("data saved.");

	}

}
