package com.example.demoWeb1;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
	@GetMapping("/")
	public String sayHello() {
		return "Hello spring boot";
		}
	@GetMapping("/hello")
	public String getMsg() {
		return "this is  1St web application program";
		
	}

}
