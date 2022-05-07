//Write program to calculate power of number (a raise to b) using while & for loop
import java.util.*;
class Exponent{
public static void main(String args[]){
int base, exponent,res=1;
Scanner sc=new Scanner(System.in);
System.out.println("enter base number");
base=sc.nextInt();
System.out.println("enter exponent number");
exponent=sc.nextInt();
while(exponent!=0)
{
res*=base;

exponent=exponent-1;
}
System.out.println("Answer = "+res);
}
}


