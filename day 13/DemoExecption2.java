//try with multiple catch

import java.util.*;


class DemoExecption2{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
int a,b,c;
System.out.println("enter two numbers " );
try{
a=sc.nextInt();
b=sc.nextInt();

c=a/b;
System.out.println("division is" +c);

}catch(ArithmeticException e){
System.out.println("cannot devide by 0");
}catch(InputMismatchException e){
System.out.println("please enter int value");
}
System.out.println("end");
}
}