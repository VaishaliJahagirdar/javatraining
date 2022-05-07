import java.util.*;
class temp{
public static void main(String args[]){
float f,c;
Scanner sc=new Scanner(System.in);
System.out.println("enter temp in fahrenheit");
f=sc.nextFloat();
c=(f-32)*5.0f/9.0f;
System.out.println("temprature in celcius is "+c);
}
}
