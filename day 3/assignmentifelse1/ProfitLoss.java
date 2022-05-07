// 7 Write a   program to calculate profit or loss.
import java.util.*;
class ProfitLoss{
public static void main(String args[]){
double cp,sp;
Scanner s= new Scanner(System.in);
System.out.println("Enter the Costprice ");
 cp=s.nextDouble();
 System.out.println("Enter the Selling price:");
 sp=s.nextDouble();
 
		if(cp-sp>0)
                {
		  System.out.println("loss " +(cp-sp));
		}
		else if(cp-sp<0)
                {
		  System.out.println("profit " +(sp-cp));
		}
		else
      {
       System.out.println(" no profit no loss " );
      }
		

}
}