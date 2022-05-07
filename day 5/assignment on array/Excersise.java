
/*3. Write a program   to find the sum of all elements of the array. 
Test Data : 
Input the number of elements to be stored in the array :3 
Input 3 elements in the array : 
element - 0 : 2 
element - 1 : 5 
element - 2 : 8 
Expected Output : 
Sum of all elements stored in the array is : 15*/
import java.util.*;
class SumArray{
public static void main(String args[]){
int i,sum=0;
int arr[]=new int[3];
Scanner sc=new Scanner(System.in);

System.out.println("Enter 3 array element  ");
for(i=0;i<arr.length;i=i+1)
{
arr[i]=sc.nextInt();
sum += arr[i];
System.out.println("addition is  "+sum);
}

}
}
/*int i,sum=0;
int[] arr={1,2,3,4};
for(i=0;i<arr.length;i=i+1)
{
System.out.println(arr[i]);
}
sum=sum+arr[i];
System.out.println(arr[i]);
}
}*/

