package com.example.demoWeb1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class StudentDetails {
	@Autowired //3RD WAY USING FEILD
	private Student stud;
//	@Autowired  //FIRST WAY USING CONSTRUCTOR
//	public StudentDetails(Student stud) {
//		this.stud=stud;
		
	//}
	
//	void setData() {
//		stud.setId(300);
//		stud.setName("vvvvvvv");
//	}
//	void showData() {
//		System.out.println(stud.getId());
//		System.out.println(stud.getName());
//
//	}  //2ND WAY USING GEETER SETEER
//	public Student getStud() {
//		return stud;
//	}
//	@Autowired
//	public void setStud(Student stud) {
//		this.stud = stud;
//	}
	void setData() {
		stud.setId(300000);
		stud.setName("ooooooooooooooooooooooooooooooooooooooo");
	}
		
	void showData() {
		System.out.println(stud.getId());
		System.out.println(stud.getName());

	}

}
