//Question 1. Print all Armstrong numbers between 100 to 999 using while loop.
import java.util.*;
class Arm{
public static void main(String args[]){
int n,n1,n2,n3,sum=0;
System.out.println("armstrong number between 1000 to 999");
for(int i=1;i<=999;i++)
{
n=i;
while(n>0)
{
n2=n%10;
sum=sum+(n2*n2*n2);
n=n/10;
}
if(sum==i)
{
System.out.println(i);
}
sum=0;
}
}
}