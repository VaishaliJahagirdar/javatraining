/*5
Write a Program with a division method who receives two integer numbers and performs the division 
operation. The method should declare that it throws ArithmeticException. This exception should be 
handled in the main method.*/
import java.util.*;
public class Assign5{
    static int div(int x,int y){
        int z=0;
        try {
            z=x/y;
        } catch (ArithmeticException e) {     
            throw e;       
        }
        return z;
    }
    public static void main(String[] args) {
      int a;
      try {
        a=div(10, 0);
        System.out.println("Div is "+a);
      } catch (Exception e) {
         System.out.println("Recaught in main");
    }
}
}
