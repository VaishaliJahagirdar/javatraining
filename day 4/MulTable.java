//Write program to print multiplication table of a given number


import java.util.*;
class MulTable{
public static void main(String args[]){
int n=1, i=1;

Scanner sc=new Scanner(System.in);
System.out.println("enter the number for multiplication table");
n=sc.nextInt();
while(i<=10)
{

System.out.println(n+" * "+i+" = "+n*i);
i=i+1;
}
}
}


