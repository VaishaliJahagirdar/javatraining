import java.util.*;
class demoTernary{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
int a,b,max;
System.out.println("enter two no");
a=sc.nextInt();
b=sc.nextInt();
// using if else:
/*if(a>b)
{
max=a;
}
else
{
max=b;
}
System.out.println(max);*/

//using ternary method 
max=a>b?a:b;
System.out.println("max number is "+max);

}
}