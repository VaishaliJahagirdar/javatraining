package com.example.demoJPQL;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.PersistenceUnit;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;


import java.util.List;
@Repository
public class MyRepository {
	@PersistenceUnit
	private EntityManagerFactory emf;
	
	void getData() {
		EntityManager em;
	em=emf.createEntityManager();
//		
//		
//		//update
//		em.getTransaction().begin();
//		String jsql;
//		jsql="update Student e Set e.name='zxcvbnm'"+"where e.id=500";
//		javax.persistence.Query q;
//		q=em.createQuery(jsql);
//		q.executeUpdate();
//		em.getTransaction().commit();
//		
		//Delete
//		em.getTransaction().begin();
//		String jsql;
//		jsql="delete from Student where e.id=500";
//		javax.persistence.Query q;
//		q=em.createQuery(jsql);
//		q.executeUpdate();
//		em.getTransaction().commit();
		
//		//Select
//	System.out.println(" Display all record in side student table");
//		em.getTransaction().begin();
//		String jsql;
//		Query q;
//		jsql="select e from Student e";
//		q=em.createQuery(jsql);
//
//		List<Student> list=q.getResultList();  
//		for(Student s:list)
//		{
//			System.out.println("  Sudent ID: "+s.getId()+"  Student name is: "+s.getName());
//	}
//		em.getTransaction().commit();
		
//		
		System.out.println("Display perticular data from table");
		em.getTransaction().begin();
		String jsql;
		Query q;
		jsql="select e from Student e where e.id=500";
		q=em.createQuery(jsql);
		Student s2=(Student)q.getSingleResult();
		System.out.println("one record from student table is:"+s2.getId());
		System.out.println("one record from student table is:"+s2.getName());
		
	}
		
		
		
	}
	


