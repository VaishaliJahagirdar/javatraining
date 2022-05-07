// find the char is upper case lowr case ,digit and special symbol:

import java.util.*;
class Ascii{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
String s1;
char ch;
int x;
System.out.println("enter character");
s1=sc.next();
ch=s1.charAt(0);
x=ch;
if(x>=65 && x<=90)
{
System.out.println("capital and  asii value is "+x);
}
else if(x>=97 && x<=122)
{
System.out.println("small letter and ascii value is "+x);
}
else if(x>=48 && x<=57)
{
System.out.println("digit and ascii value is "+x);
}
else
{
System.out.println("special symbol"+x);
}
}
}





