/*Exercise 1 — Array Sum 
Examine the following program: 
class Exercise1
{
 public static void main ( String[] args )
 {
 int[] val = {0, 1, 2, 3}; 
 sum = System.out.println( "Sum of all numbers = " + sum );
 }
}
Complete the assignment statement so that it computes the sum of all the numbers in the array. */

class Exercise1
{
 public static void main ( String[] args )
 {
int sum=0,i;
 int[] val = {0, 1, 2, 3}; 
 for(i=0;i<val.length;i++)
 {
System.out.println(val[i]);
sum=sum+val[i];

}
System.out.println("sum of the array element is "+sum);

}
 }
