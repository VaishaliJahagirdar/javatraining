/*Exercise 7 —Your Age in Seconds
Write a program that asks for your age in years, months, and days and writes out your age in 
seconds. Do this by calculating the number of total days you have been alive, then multiply this 
by the number of hours per day (24), the number of minutes per hour (60), and the number of 
seconds per minute (60). Assume that there are 365 days per year (ignore leap years). But 
correctly take account of the different number of days in different months. If the user enters 5 for 
the number of months, add up the number of days in the first 5 months: 31 + 28 + 31 + 30 + 
31
A human lifespan is about 2.5 billion seconds (2.5 billion heart-beats). Write out what 
percentage of your expected lifespan you have lived.*/

import java.io.*;
 
class AgeInSecond {
    static void findAge(int current_date, int current_month,
                    int current_year, int birth_date,
                    int birth_month, int birth_year)
    {
        int month[] = { 31, 28, 31, 30, 31, 30, 31,
                             31, 30, 31, 30, 31 };
 
        // if birth date is greater then current
        // birth_month, then donot count this month
        // and add 30 to the date so as to subtract
        // the date and get the remaining days
        if (birth_date > current_date) {
            current_month = current_month - 1;
            current_date = current_date + month[birth_month - 1];
        }
 
        // if birth month exceeds current month,
        // then do not count this year and add
        // 12 to the month so that we can subtract
        // and find out the difference
        if (birth_month > current_month) {
            current_year = current_year - 1;
            current_month = current_month + 12;
        }
 
        // calculate date, month, year
        int calculated_date = current_date - birth_date;
        int calculated_month = current_month - birth_month;
        int calculated_year = current_year - birth_year;
 
        // print the present age
        System.out.println("Present Age");
        System.out.println("Years: " + calculated_year +
              " Months: " + calculated_month + " Days: " +
              calculated_date);
    }
    public static void main(String[] args)
    {
        // present date
        int current_date = 7;
        int current_month = 12;
        int current_year = 2017;
 
        // birth dd// mm// yyyy
        int birth_date = 16;
        int birth_month = 12;
        int birth_year = 2009;
 
        // function call to print age
        findAge(current_date, current_month, current_year,
              birth_date, birth_month, birth_year);
    }
}