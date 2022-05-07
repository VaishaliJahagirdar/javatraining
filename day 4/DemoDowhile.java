// Do while loop

import java.util.*;
class DemoDowhile{
public static void main(String args[]){


int a,b,c;
String choice;
do
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter 2 number");
a=sc.nextInt();
b=sc.nextInt();
c=a+b;
System.out.println("Addition is "+c);
System.out.println("do you want to continue ? (yes/no)");
choice=sc.next();
}while(choice.equals("yes"));
}
}

