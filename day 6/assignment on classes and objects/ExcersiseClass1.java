/*Classes and objects Assignment
1. Create a class that captures students.
 Each student has a first name, last name, class year, and 
major. 
Create two examples of students.*/
import java.util.*;
class Student1{
// attrinute of Student;
String first_name;
String last_name;
int class_year;
String major;


//first Student 

Student1()
{
Scanner sc=new Scanner(System.in);
System.out.println(" enter first name of student");
first_name=sc.next();
System.out.println(" enter last name student");
last_name=sc.next();
System.out.println(" enter class year of student");
class_year=sc.nextInt();
System.out.println(" enter major of student");
major=sc.next();
}
void show1()
{
System.out.println(" Name of the first Student :"+first_name+" " +last_name);
System.out.println(" Class year of student: "+class_year);
System.out.println(" Major of student: "+major);
}
}
//second Student
class Student2{
// attrinute of Student;
String first_name2;
String last_name2;
int class_year2;
String major2;

Student2()
{
Scanner sc=new Scanner(System.in);
System.out.println(" enter Second name of student");
first_name2=sc.next();
System.out.println(" enter last name student");
last_name2=sc.next();
System.out.println(" enter class year of student");
class_year2=sc.nextInt();
System.out.println(" enter major of student");
major2=sc.next();
}
void show2()
{
System.out.println(" Name of the secound Student :"+first_name2+" " +last_name2 );
System.out.println(" Class year of student: "+class_year2);
System.out.println(" Major of student: "+major2);
}
}
class CaptureStudent
{
public static void main(String[] args)
{
Student1 st1=new Student1();
st1.show1();
Student2 st2=new Student2();
st2.show2();
}
}
