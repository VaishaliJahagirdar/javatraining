import java.util.*;
class LoopEx
{
public static void main(String args[])
{
int i=1,n;
int sum=0;
Scanner sc=new Scanner(System.in);
System.out.println("enter number");
n=sc.nextInt();
while(i<=n);
{
sum=sum+i;
i=i+1;
}
System.out.println("addition is " +sum);
}
}


//write a program to take anumber fro user and print its factorial value