//declaration const variable

/*class DemoFinal{
public static void main(String args[]){
 final float pi=3.14f;
System.out.println(pi);
System.out.println(Math.PI);
}
}*/
// if else program:
import java.util.*;
class DemoFinal{
public static void main(String args[]){
String name;
int age;
Scanner sc=new Scanner(System.in);
System.out.println("enter name and age");
name=sc.next();
age=sc.nextInt();
if(age>=18)
{

System.out.println("you can cast a vote");
}
else
{
System.out.println("you can not cast vote");
}

}
}





