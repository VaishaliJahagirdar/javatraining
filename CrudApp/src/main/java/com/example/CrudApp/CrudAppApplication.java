package com.example.CrudApp;

import java.util.Optional;

import javax.persistence.metamodel.ListAttribute;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import antlr.collections.List;

@SpringBootApplication
public class CrudAppApplication {

	@SuppressWarnings({ "rawtypes" })
	public static void main(String[] args) {
		ApplicationContext context;
		context=SpringApplication.run(CrudAppApplication.class, args);
		StudentRepository stud;
		stud=context.getBean(StudentRepository.class);
		
//		//insert
//		Student st1=new Student(300,"cxcx");
//		stud.save(st1);
//		System.out.println("record inserted");
//		
//		//update
//		Optional<Student> op;
//		op=stud.findById(300);
//		Student st2=op.get();
//		System.out.println(st2.getId());
//		System.out.println(st2.getName());
//		st2.setName("Vaishu 1234");
//		stud.save(st2);
//		System.out.println("record updated");
//		
//		//Delete
//		Optional<Student> op;
//		op=stud.findById(800);
//		Student st2=op.get();
//		System.out.println(st2.getId());
//		System.out.println(st2.getName());
//		stud.delete(st2);
//		System.out.println("Record deleted");
//		
		
		// Select all record
		
		java.util.List<Student> studlist;
		studlist=stud.findAll();
		for(Student sts: studlist) {
			System.out.println(sts.getId());
//			System.out.println(sts.getName());
		}
		
		
	}

}
