package com.example.demoManyToOne;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;


@SpringBootApplication
public class DemoManyToOneApplication {

	public static void main(String[] args) {
		
		ApplicationContext context;
		context=SpringApplication.run(DemoManyToOneApplication.class, args);
		CartRepository cart;
		 cart=context.getBean(CartRepository.class);
		ItemsRepository items;
		items=context.getBean(ItemsRepository.class);
		
		Cart c1=new Cart(4,"abc");
		cart.save(c1);
		Items i1=new Items(400,"abc",600,c1);
		items.save(i1);
	}

}
