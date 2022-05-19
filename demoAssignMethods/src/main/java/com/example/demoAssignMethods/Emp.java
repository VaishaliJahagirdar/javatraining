package com.example.demoAssignMethods;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Emp {
	@Id
	private int emp_id;
	private String name;
	private String add;
	private String email;
	private int mobile_no;
	private int salary;
	
	public Emp() {
		
	}

	public int getEmp_id() {
		return emp_id;
	}

	public void setEmp_id(int emp_id) {
		this.emp_id = emp_id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAdd() {
		return add;
	}

	public void setAdd(String add) {
		this.add = add;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getMobile_no() {
		return mobile_no;
	}

	public void setMobile_no(int mobile_no) {
		this.mobile_no = mobile_no;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public Emp(int emp_id, String name, String add, String email, int mobile_no, int salary) {
		super();
		this.emp_id = emp_id;
		this.name = name;
		this.add = add;
		this.email = email;
		this.mobile_no = mobile_no;
		this.salary = salary;
	}
	

}
