package com.example.demoWeb1;


import org.springframework.beans.factory.BeanFactory;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;


@SpringBootApplication
public class DemoWeb1Application {

	public static void main(String[] args) {

		ApplicationContext context;
		context=SpringApplication.run(DemoWeb1Application.class, args);
		StudentDetails st;
		st=context.getBean(StudentDetails.class);
		st.setData();
		st.showData();

		
	}

}
