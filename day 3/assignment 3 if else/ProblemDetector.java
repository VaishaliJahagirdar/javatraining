/*Exercise 5 — Y2K Problem Detector
Write a program that asks a user for their birth year encoded as two digits (like "62") and for the 
current year, also encoded as two digits (like "99"). The program is to correctly write out the 
users age in years.*/
import java.util.*;
class ProblemDetector{
public static void main(String args[]){
Scanner sc = new Scanner( System.in );
   int current, birth, a;
 
 System.out.println("Enter Year of Birth\n");
birth=sc.nextInt();
  System.out.println("Enter Current year\n");
current=sc.nextInt();  
  if(current<birth)
  {
    birth=100-birth;
    a=birth+current;
   System.out.println("Your age is %d"+a);
  }
  else
  {
  System.out.println("Your age is "+(current-birth));
  }

}
}