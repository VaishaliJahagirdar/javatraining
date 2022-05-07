/*2. Write a program   to read n number of values in an array and display it in reverse order. 
Test Data : 
Input the number of elements to store in the array :3 
Input 3 number of elements in the array : 
element - 0 : 2 
element - 1 : 5 
element - 2 : 7 
Expected Output : 
The values store into the array are : 
2 5 7 
The values store into the array in reverse are : 
7 5 2 */
import java.util.*;
 class Reverse {  
    public static void main(String[] args) {
    int i;
int arr[]=new int[3];
Scanner sc=new Scanner(System.in);
System.out.println("Enter 3 array element  ");
for(i=0;i<arr.length;i=i+1)
{
arr[i]=sc.nextInt();
}
 for (i = arr.length-1; i >= 0; i--) 
               {  
            System.out.print(" " +arr[i]);  
        }  
    }  
}  
