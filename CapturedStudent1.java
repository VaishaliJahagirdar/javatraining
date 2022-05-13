
/*4. Create a class that captures students. Each student has a first name, last name, class year, and major. 
Declare these variables as private and provide getter and setter methods for these variables
Create two examples of students(means create 2 objects of Student class). 

NOTE : Do not take input from keyboard. Set the values by using setter method and to get values use getter method*/

import java.util.*;
class Student1{

private int id,cls;
private String fname,lname,major;
public int getId(){
return id;
}
public int getCls(){
return cls;
}
public String getFname(){
return fname;
}
public String getLname(){
return lname;
}
public String getMajor(){
return major;
}

public void setId(int id){
this.id=id;
}
public void setCls(int cls){
this.cls=cls;
}
public void setFname(String fname){
this.fname=fname;
}
public void setLname(String lname){
this.lname=lname;
}
public void setMajor(String major){
this.major=major;
}
public void show(){
System.out.println(getId());
System.out.println(getCls());
System.out.println(getFname());
System.out.println(getLname());
System.out.println(getMajor());
}
}

class Student2{
private int id1,cls1;
private String fname1,lname1,major1;
public int getId1(){
return id1;
}
public int getCls1(){
return cls1;
}
public String getFname1(){
return fname1;
}
public String getLname1(){
return lname1;
}
public String getMajor1(){
return major1;
}

public void setId1(int id1){
this.id1=id1;
}
public void setCls1(int cls1){
this.cls1=cls1;
}
public void setFname1(String fname1){
this.fname1=fname1;
}
public void setLname1(String lname1){
this.lname1=lname1;
}
public void setMajor1(String major1){
this.major1=major1;
}
public void show1(){
System.out.println(getId1());
System.out.println(getCls1());
System.out.println(getFname1());
System.out.println(getLname1());
System.out.println(getMajor1());
}
}



class CaptureStudent1
{
public static void main(String[] args)
{
Student1 st1=new Student1();
st1.setId(100);
st1.setCls(4);
st1.setFname("vaishali");
st1.setLname("jahagirdar");
st1.setMajor("Electronics and telecommunication");
st1.show();

System.out.println("******************************************");

Student2 st2=new Student2();
st2.setId1(200);
st2.setCls1(4);
st2.setFname1("Pooja");
st2.setLname1("patil");
st2.setMajor1("Electronics and telecommunication");
st2.show1();


}
}
