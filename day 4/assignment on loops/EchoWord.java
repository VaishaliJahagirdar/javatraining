/*Exercise 4 — Repeatedly Echo a Word
Write a program that asks the user to enter a word. The program will then repeat word for as 
many times as it has characters:*/

import java.util.*;
class EchoWord{
public static void main(String args[]){
int times, i=0;
String s1;
Scanner sc=new Scanner(System.in);
System.out.println("enter the word");
s1=sc.next();
times =s1.length();
while(i<=times)
{
System.out.println(s1);
i=i+1;
}
}
}
