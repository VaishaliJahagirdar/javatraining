/*Exercise 6 — Wind Chill Index
Write a program that calculates the wind chill index given the temperature and the wind speed. 
C:\JavaCode> java WindChill
Enter Wind Speed:
15
Enter Temperature:
20
Wind Chill: 6.218885266083872
The wind chill index (WCI) is calculated from the wind speed v in miles per hour and the 
temperature temp in Fahrenheit. Three formulas are used, depending on the wind speed: 
If wind speed is less than 3 mph then wind chill = current temperature
If the current temperature is greater than 50° F then wind chill = current 
temperature
otherwise, wind chill = 35.74 + 0.6215*temp - 35.75*v0.16 + 0.4275*temp*v0.16
You will need to import java.lang.Math and use floating point input for this exercise. To 
calculate v0.16 use Math.pow().*/

import java.util.Scanner;

 class WnidChill {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		// Prompt the user to enter a temperature and a wind speed
		System.out.print("Enter the temperature in Fahrenheit " +
			"between -58F and 41F: ");
		double temperature = input.nextDouble();
		System.out.print("Enter the wind speed (>= 2) in miles per hour: ");
		double speed = input.nextDouble();

		if (temperature <= -58 || temperature >= 41 || speed < 2)
		{
			System.out.print("The ");
			if (temperature <= -58 || temperature >= 41)
				System.out.print("temperature ");
			if ((temperature <= -58 || temperature >= 41) && speed < 2)
				System.out.print("and ");
			if (speed < 2)
				System.out.print("wind speed ");
			System.out.println("is invalid");
			System.exit(1);
		}

		// Compute the wind chill index
		double windChill = 35.74 + 0.6215 * temperature -
								 35.75 * Math.pow(speed, 0.16) +
								 0.4275 * temperature * Math.pow(speed, 0.16);

		// Display result
		System.out.println("The wind chill index is " + windChill);
	}
}