// 1 Write a program to find maximum between three numbers

import java.util.*;
class Assignmax{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
int a,b,c;
System.out.println("enter three numbers ");
a=sc.nextInt();
b=sc.nextInt();
c=sc.nextInt();
if(a>=b && a>=c)
{
System.out.println("max number is "+a);
}
else if(b>=a && b>=c)
{
System.out.println("max no is  "+b);
}
else
{
System.out.println("max number is "+c);
}
}
}


