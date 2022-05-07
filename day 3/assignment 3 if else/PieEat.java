/*Exercise 4 — Pie Eating Contest
At the State Fair Pie Eating Contest all contestants in the heavyweight division must weigh 
within 100 pounds and 250 pounds. Write a program that asks for a contestant's weight and then 
says if the contestant is allowed in the contest.*/

import java.util.Scanner;




 class PieEat {

public static void main(String[] args) {

Scanner console = new Scanner(System.in);

System.out.println("Enter your weight in pounds, please: ");

String temp = console.next();

int weight = Integer.parseInt(temp);

if (weight >= 30 && weight <= 250) {

System.out.println("You're allowed in the contest");

} else

System.out.println("You're NOT allowed in the contest");




}

}