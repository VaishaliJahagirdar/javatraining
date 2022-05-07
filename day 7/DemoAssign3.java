class Customer{
 private String_name fname;
 private string_name lname;
   void setFname(String fname){
   this.fname=fname;
   
 }
 String getFname(){
 return this.fname;
 }
 void setLname(String lname){
   this.lname=lname;
   
 }
 String getLname(){
 return this.Lname;
 }

 }
 class Account{
 int balance;
 Customer cust;
 Account(Customer cust, int balance){
 this.cust=cust;
 this.balence=balance;
 }
 void showAccount(){
 System.out.println("Fname: "+cust.getFname());
  System.out.println("Lname: "+cust.getLname());
   System.out.println("balence "+balence);
   }
   }
  Account(Customer cust, int balance){
 this.cust=c;
 this.balence=balance;
 
}
}

 
 
 class DemoAssign3
{
public static void main ( String[] args )
{
Customer ob1=new Customer;
ob1.setFname("abc");
ob1.setlname("xyz");
Account acc1=new Account(ob1,1000);
Account acc2=new Account(ob1,2000);
}
}

