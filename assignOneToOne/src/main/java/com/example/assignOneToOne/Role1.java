package com.example.assignOneToOne;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;


@Entity
public class Role1 {

	
		
		@Id
		private int roll_id;	
		private String roll_desc;
		
	    @OneToOne(mappedBy ="rollobj" )
		private Emp1 emp;
		private Emp1 emp1;
public Role1() {

}
	 

		public Role1(int roll_id, String roll_desc) {
	super();
	this.roll_id = roll_id;
	this.roll_desc = roll_desc;
}


		public int getRoll_id() {
			return roll_id;
		}

		public void setRoll_id(int roll_id) {
			this.roll_id = roll_id;
		}

		public String getRoll_desc() {
			return roll_desc;
		}

		public void setRoll_desc(String roll_desc) {
			this.roll_desc = roll_desc;
		}

		public Emp1 getEmp1() {
			return emp1;
		}

		public void setEmp1(Emp1 emp1) {
			this.emp1 = emp1;
		}
	    
	    
	    
	    

}
