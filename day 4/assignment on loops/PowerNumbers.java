/*Exercise 8:
4. Write program to calculate power of number (a raise to b) using while & for loop*/
import java.util.*;
class PowerNumbers{

public static void main(String args[]) 
{
Scanner sc=new Scanner(System.in);
    int exponent;
    float base, result = 1;

   System.out.println("Enter base and exponent respectively:  ");
    base=sc.nextFloat();
    exponent=sc.nextInt();
    

    System.out.println(base +"^"  +exponent  +" = ");

    while (exponent != 0) {
        result *= base;
        --exponent;
    }

   System.out.println(result);
    
   }
   }
