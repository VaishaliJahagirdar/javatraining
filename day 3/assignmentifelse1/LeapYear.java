// 4 Write a   program to check whether a year is leap year or not.

import java.util.*;
class LeapYear{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
int year;
System.out.println("enter a  numbers ");
year=sc.nextInt();
if(year%4==0 && year%100!=0)
{
System.out.println("is  leap year "+year);
}
else if(year%100==0)
{
System.out.println("is not leap year "+year);
}
else if(year%400==0)
{
System.out.println("is not leap year "+year);
}
else
{
System.out.println("is not leap year "+year);
}
}
}



