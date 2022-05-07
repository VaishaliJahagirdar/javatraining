/* Write a program that averages the rain fall for three months, April, May, and June. Declare and 
initialize a variable to the rain fall for each month. Compute the average, and write out the 
results, something like: 
Rainfall for April: 12
Rainfall for May : 14
Rainfall for June: 8
Average rainfall: 11.333333
example 6*/

public class rain
{
public static void main(String args[]){
int april= 12,may=14,june=8;
System.out.println("rainfall for April: "+april);
System.out.println("rainfall for may:"+may);
System.out.println("rainfall for June:"+june);




float avg;
avg=(april+may+june)/3;

System.out.println("Avarage rainfall:"+avg);
}
}