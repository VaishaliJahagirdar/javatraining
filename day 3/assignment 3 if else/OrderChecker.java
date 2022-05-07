import java.util.*;

public class OrderChecker {
	public static void main (String [] args) {

		Scanner sc = new Scanner(System.in);
		int bolts, nuts, washers;
		double cost;
      final int bolt = 5;
      System.out.println("Please enter  the number of bolts, nuts and washers you wish to buy");
		

		      bolts=sc.nextInt();
      nuts=sc.nextInt();
      washers=sc.nextInt();

		if (bolts >= nuts) 
      {
			System.out.println("Check the order");
			System.out.println("Total amount will not be calculated");
		} 
      else
       {
			cost = (bolts * 05) + (nuts * 03) + (washers * 01);
			System.out.println("Order is OK");
			System.out.println("The total cost is: " + cost);
		
	}
}