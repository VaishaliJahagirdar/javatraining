/*Exercise 3 — Sum of a Range of Sequential Integers
Write a program that asks the user for two integers, low and high and then sums all the integers 
(inclusive) low through N. 
Enter low:
5
Enter high:
10
Sum = 45
Do this by noticing that the sum from low to high is the same as the sum from one to high minus 
the sum from one to (low-1). Calculate each of these by using the formula: 
sum = (n*(n+1))/2*/

import java.util.*;
class SumHighLow{
public static void main(String args[]){
int a,b,sum=0;
Scanner sc=new Scanner(System.in);
System.out.println("Enter  low number ");
a=sc.nextInt();
System.out.println("Enter  high number ");
b=sc.nextInt();
while(a<=b)
{
sum =sum+a;
a=a+1;
}
System.out.println("addition is"+sum);
}
}

