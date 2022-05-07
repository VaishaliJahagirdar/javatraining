import java.util.*;
class DemoArray{
public static void main(String args[]){


Scanner sc=new Scanner(System.in);
//Declared integer array size 5:
int i;
int arr[]=new int[5];

System.out.println("Enter 5 array element  ");
for(i=0;i<arr.length;i=i+1)
{
arr[i]=sc.nextInt();
}
System.out.println("your array");
for(i=0;i<arr.length;i=i+1)
{
//System.out.println(arr[i]*arr[i]);
if(arr[i]%2==0)
{
System.out.println(arr[i]);
}

}
}
}

