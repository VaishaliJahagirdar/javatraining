/*4
Write a class MathOperation which accepts integers from command line. Create an array using these 
parameters. Loop through the array and obtain the sum and average of all the elements. Display the 
result. Check for various exceptions that may arise like ArithmeticException, NumberFormatException, 
and so on. For example: The class would be invoked as follows: C:>java MathOperation 1900, 4560, 0, 
32500*/
import java.util.*;

 class Assig4 {

	public static void main(String[] args) {
		//int n = args.length;
		
		//for (int i = 0; i < n; i++)
			//if (args[i].charAt(args[i].length() - 1) == ',') 
				//args[i] = args[i].replace(",", "");
		
		//System.out.println(Arrays.toString(args));
      Scanner sc=new Scanner(System.in);
System.out.println("Enter the number of elements in the arrays");

int i,n,index;
 n = sc.nextInt();

System.out.println("Enter the elements in the array: ");

		
		int[] arr = new int[n];

		int sum = 0;
		double avg = 0;
		
		try {
			for ( i = 0; i < n; i++)
				arr[i] = sc.nextInt();
			
			for ( i = 0; i < n; i++)
				sum += arr[i];
			
			avg = sum / n;
         System.out.println("sum: " + sum);
		System.out.println("avg: " + avg);
      
		} catch (NumberFormatException e) {
			System.out.println("NumberFormatException");
		} catch (ArithmeticException e) {
			System.out.println("ArithmeticException");
		} catch (InputMismatchException e) {
			System.out.println("InputMismatchException");
		}
		
		
		
	}

}