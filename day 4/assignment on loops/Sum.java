/*Exercise 2 — Sum of Sequential Integers
Write a program that asks the user for N and then sum all the integers (inclusive) between 1 and 
N. 
Enter N:
10
Sum = 55
Do this in a loop that counts up 1 to N and in each iteration adds the current count to the sum. 
Another way to calculate the same thing is through a formula: 
sum = (n*(n+1))/2*/
import java.util.*;
class LoopEx
{
public static void main(String args[]){
int i=0;
int sum=0;
int n;
Scanner sc=new Scanner(System.in);
System.out.println("enter number for addition");
n=sc.nextInt();

while(i<=n);
{
sum = (n*(n+1))/2;
i=i+1;

}
System.out.println(sum);

}

}
