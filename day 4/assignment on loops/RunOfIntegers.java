/*Exercise 1 — Run of Integers
Write a program that asks the user for a starting value and an ending value and then writes all the 
integers (inclusive) between those two values. 
Enter Start:
5
Enter End:
9
5
6
7
8
9*/

import java.util.*;
class RunOfIntegers{
public static void main(String args[]){
int a,b;
Scanner sc=new Scanner(System.in);
System.out.println("Enter number to start");
a=sc.nextInt();
System.out.println("Enter number to end");
b=sc.nextInt();
while(a<=b)
{
System.out.println(a);
a=a+1;
}
}
}
 
