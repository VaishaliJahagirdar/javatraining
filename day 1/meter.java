import java.util.*;
class meter{
public static void main(String args[]){
float m,f,i;
Scanner sc=new Scanner(System.in);
System.out.println("enter the value in meter");
m=sc.nextFloat();
f=m*3.28084f;
System.out.println("conversion of meter into feet is = "+f);

i=m*39.37f;
System.out.println("conversion of meter into inches is = "+i);
}
}



