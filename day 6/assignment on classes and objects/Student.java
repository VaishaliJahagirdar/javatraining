/* 7.Write a program to implement a class “student” with the following members. 
Name of the student. Marks of the student obtained in three subjects. Function to assign initial values. 
Function to compute total average. Function to display the student’s name and the total marks. 
Write an appropriate main() function to demonstrate the functioning of the above.*/

import java.util.*;

public class Student
{
    private String name;
    private int sub1;
    private int sub2;
    private int sub3;
    private double total;
    private double avg;
    
    void get() {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter student name: ");
        name = in.nextLine();
        System.out.print("Enter marks in English: ");
        sub1 = in.nextInt();
        System.out.print("Enter marks in Hindi: ");
        sub2 = in.nextInt();
        System.out.print("Enter marks in Maths: ");
        sub2 = in.nextInt();
    }
    
     void calculate() {
        total = sub1 + sub2 + sub3;
        avg = total / 3.0;
    }
    
    void display() {
        System.out.println("Name: " + name);
        System.out.println("Marks in subject 1: " + sub1);
        System.out.println("Marks in subject 2: " + sub2);
        System.out.println("Marks in subject 3: " + sub3);
        System.out.println("Total Marks: " + total);
        System.out.println("Average Marks: " + avg);
    }
    
    public static void main(String args[]) {
        Student s1 = new Student();
        s1.get();
        s1.calculate();
        s1.display();
    }
}