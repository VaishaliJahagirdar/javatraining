//4.Write a Java program to calculate the average value of array elements. 

import java.util.*;
class AvarageArray{
public static void main(String args[]){

int i,sum=0,len;
double avg;
int arr[]=new int[3];
Scanner sc=new Scanner(System.in);

System.out.println("Enter 3 array element  ");
for(i=0;i<arr.length;i=i+1)
{
arr[i]=sc.nextInt();
sum += arr[i];

}
len =arr.length;
avg= sum/ len;
System.out.println("avarage of array element "+avg);


}
}




