package com.example.demoJPQL;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class DemoJpqlApplication {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		
		ApplicationContext context;
		context=SpringApplication.run(DemoJpqlApplication.class, args);
		MyRepository stud;
		stud=context.getBean(MyRepository.class);
		stud.getData();
	}

}
