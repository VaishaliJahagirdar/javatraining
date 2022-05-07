/*Exercise 10:
6. Write program to find the sum of first and last digit of any number(number may contain 
3 digit,4 digit or 5 digit*/

import java.util.*;

 
 class FirstLast{
     
    // Find the first digit
     static int firstDigit(int m)
    {
        // Remove last digit from number
        // till only one digit is left
        while (m >= 10)
            m /= 10;
     
        // return the first digit
        return m;
    }
 
    // Find the last digit
    static int lastDigit(int n)
    {
        // return the last digit
        return (n % 10);
    }
    public static int Calculate(int sum)
    {
    //sum of first and last digit
    sum=m+n;
     
    // driver function
    public static void main(String argc[])
    {
        int n = 98562;
        System.out.println(firstDigit(n) + " "
        + lastDigit(n)+" "+sum);
    }
}