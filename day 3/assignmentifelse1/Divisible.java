// 3 Write a   program to check whether a number is divisible by 5 and 11 or not.

import java.util.*;
class Divisible{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
int n;
System.out.println("enter a  numbers ");
n=sc.nextInt();
if(n%5==0)
{
System.out.println("number is divisible by 5  "+n);

}
else if(n%11==0)
{
System.out.println("number is divisible by 11  "+n);
}
else
{
System.out.println("number is not divisible by 5 or 11");
}
}
}

