import java.util.* ;
class LastChanceGas
{
  public static void main (String[] args)
  {
    Scanner sc= new Scanner( System.in );
    int tank, gage, mgallon;   // stores input
    int gasLeft = 0;           // stores how much gas left
    int milesLeft = 0;         // stores how many miles are left

    System.out.print("Tank capacity: ");
    tank = sc.nextInt();

    System.out.print("Gage Reading ");
    gage   = sc.nextInt();

    System.out.print("MPG (Miles Per Gallon): ");
    mgallon  = sc.nextInt();
   
       
    gasLeft = (tank * gage)/100;   // does the math
    milesLeft = gasLeft * mgallon;
   
    if (milesLeft < 200)
      System.out.print("Get Gas ");//true branch
   
    else
     
      System.out.print("Safe to Proceed "); //false branch
   
  }
}
