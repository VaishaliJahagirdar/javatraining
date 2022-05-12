//3.Write a Program that take 5 numbers into array and print square value of each number.
import java.util.*;
class Arr{
public static void main(String args[]){
int [] n={2,3,4,5,6};
for(int value:n)
{
System.out.println(value);
}
for(int i=0; i<n.length;i++)
{
n[i]=(int) Math.pow(n[i],2);
}
for(int value :n)
{
System.out.println(value);
}
}
}