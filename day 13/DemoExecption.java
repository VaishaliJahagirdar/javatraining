//EXCEPTION
//try with catch

import java.util.*;


class DemoExecption{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
int a,b,c;
System.out.println("enter two numbers " );
a=sc.nextInt();
b=sc.nextInt();
try{
c=a/b;
System.out.println("division is" +c);

}catch(ArithmeticException e){
System.out.println("cannot devide by 0");
}
}
}