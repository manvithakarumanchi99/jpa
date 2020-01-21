package com.lti.ui;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import javax.persistence.TypedQuery;

import com.lti.model.student;
public class Main4 {

	public static void main(String[] args) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("JPA_PU");
		EntityManager entityManager = factory.createEntityManager();

		Query q = entityManager.createQuery("From student");
		List<student> list = q.getResultList();//in order to execute select query will use getresultlist which gives list of rcrds
		for (student s : list) {
			System.out.println(s);
		}
	TypedQuery<student> tquery= 	entityManager.createQuery("From student",student.class);
		List<student> list2 = tquery.getResultList();
		for (student s : list2) {
			System.out.println(s);
		}
		entityManager.close();
		factory.close();

	}

}
