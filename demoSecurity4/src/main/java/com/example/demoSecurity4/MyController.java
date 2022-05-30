package com.example.demoSecurity4;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {
	@GetMapping("/")
	public String home() {
		String s1= "<h1>WELCOME TO OUE PAGE!!</h1>";
		String s2="<br><a href=/logout>Logout</a>";
		String s3="<br><img src=/images/vaishu.jpg alt=image not found>";
		return s1+s2+s3;
	}

}


