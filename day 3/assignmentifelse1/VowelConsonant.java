// 5 Write a   program to input any alphabet and check whether it is vowel or consonant

import java.util.*;

 class VowelConsonant {
public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    String s1;
    char ch;
    s1=sc.next();
   ch=s1.charAt(0);
if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' )
{
            System.out.println(ch + " is vowel");
            }
 else
 {
  System.out.println(ch + " is consonant");
            }
            }
            }