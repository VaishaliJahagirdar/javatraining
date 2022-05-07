/* 9 Write a program to input basic salary of an employee and calculate its Gross salary according to following:
Basic Salary <= 10000 : HRA = 20%, DA = 80%
Basic Salary <= 20000 : HRA = 25%, DA = 90%
Basic Salary > 20000 : HRA = 30%, DA = 95%*/

import java.util.*;
class GrossSalary{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
double  basic, gross, da, hra;
System.out.println("Enter the basic salary of an employee ");
basic=sc.nextDouble();
if(basic <= 10000)
    {
        da  = basic * 0.8;
        hra = basic * 0.2;
    }
    else if(basic <= 20000)
    {
        da  = basic * 0.9;
        hra = basic * 0.25;
    }
    else
    {
        da  = basic * 0.95;
        hra = basic * 0.3;
    }
  gross = basic + hra + da;

    System.out.println("GROSS SALARY OF EMPLOYEE = "+ gross);
    }
    }





