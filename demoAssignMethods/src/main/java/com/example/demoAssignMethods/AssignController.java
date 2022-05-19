package com.example.demoAssignMethods;


import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;



@RestController
public class AssignController {
	
	@Autowired
	private EmpRepository emp;

	//GET METHOD FIND ALL
	@GetMapping("/emp")
	public List<Emp> getAllEmp(){
		
	return emp.findAll();
		
	}
//	@PostMapping("/save")
//	public Emp CreateEmp(@RequestBody Emp emp1){
//		return emp.save(emp1);
//	}
	
//	//UPDATE DATA
//    @PutMapping("/updateemp/{id}")
//	public boolean updateEmployee(@PathVariable(value = "id") Integer empId,
//			@RequestBody Emp empDetails) throws Exception {
//		boolean f=true;
//		try {
//			Optional<Emp> op = emp.findById(empId);
//			Emp emp2 = op.get();
//		emp2.setName(empDetails.getName());
//			final Emp updatedemp = emp.save(emp2);
//			emp2.setAdd(empDetails.getAdd());
//			final Emp updatedemp1 = emp.save(emp2);
//			emp2.setEmail(empDetails.getEmail());
//			final Emp updatedemp2 = emp.save(emp2);
//			emp2.setMobile_no(empDetails.getMobile_no());
//			final Emp updatedemp3 = emp.save(emp2);
//			emp2.setSalary(empDetails.getSalary());
//			final Emp updatedemp4 = emp.save(emp2);
//		} catch(Exception e) {
//			f=false;
//		}
//		return f;
//	}

	//DELETE RECORD
//	@DeleteMapping("/deleteemp/{id}")
//	public boolean deleteEmployee(@PathVariable(value = "id") Integer empId,
//			@RequestBody Emp empDetails) throws Exception {
//			Optional<Emp> op = emp.findById(empId);
//		Emp emp1 = op.get();
//		 
//		emp.delete(emp1);
//		return true;
//	}
}
