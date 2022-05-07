// For each loop:


import java.util.*;
class ForEach{
public static void main(String args[]){


Scanner sc=new Scanner(System.in);
//Declared integer array size 5:
int i,item;
int[] arr={1,2,3,4,5,6};
for(i=0;i<arr.length;i=i+1)
{
System.out.println(arr[i]);
}
System.out.println("using for each loop");
for(int x:arr)
{
System.out.println(x);
}
}
}
