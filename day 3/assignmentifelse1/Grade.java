/* 8 Write a  program to input marks of five subjects Physics, Chemistry, Biology, Mathematics and Computer. Calculate percentage and grade according to following:
Percentage >= 90% : Grade A
Percentage >= 80% : Grade B
Percentage >= 70% : Grade C
Percentage >= 60% : Grade D
Percentage >= 40% : Grade E
Percentage < 40% : Grade F*/

import java.util.*;
class Grade{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
double m1,m2,m3,m4,m5,avg;
System.out.println("enter the marks of five sub ");
m1=sc.nextDouble();
m2=sc.nextDouble();
m3=sc.nextDouble();
m4=sc.nextDouble();
m5=sc.nextDouble();
avg=(m1+m2+m3+m4+m5)/5;
if(avg>=90)
{
    System.out.println("congratulations your Grade is: A "+avg);
    }
else if (avg>=80&avg<90)
{
    System.out.println(" congratulations your Grade is: B "+avg);
    }
else if(avg>=70&avg<80)
{
    System.out.println("your Grade is: C "+avg);
    }
else if(avg>=60&avg<70)
{
    System.out.println(" your Grade is: D "+avg);
    }
else
{
    System.out.println("your Grade is: F "+avg);
    }
    }
    }
