//Write program to check a enter number is Prime number or not using while & for loop

import java.util.*;
class Prime{
public static void main(String args[]){
int n, i=2;

Scanner sc=new Scanner(System.in);
System.out.println("enter a number");
n=sc.nextInt();
while(i<= n/ 2)
{
if(n%i==0)
{

System.out.println("this is not prime no.");
}
else
{
System.out.println("this is prime no.");
}
i=i+1;
}
}
}



