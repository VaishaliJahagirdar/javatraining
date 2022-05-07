// 2 Write a   program to check whether a number is negative, positive or zero

import java.util.*;
class NumberPositiveNegative{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
int n;
System.out.println("enter two  numbers ");
n=sc.nextInt();

if(n>0)
{
System.out.println("number is positive ");
}
else if(n<0)
{
System.out.println("number is negative ");
}
else
{
System.out.println("number is zero ");
}
}
}

