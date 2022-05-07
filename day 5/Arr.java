import java.util.*;
class Arr{
public static void main(String args[]){


Scanner sc=new Scanner(System.in);
//Declared integer array size 5:
int i,item;
int[] arr={1,2,3,4,5,6};
boolean isFound=false;
//System.out.println(arr.length);
System.out.println(" enter  item to search");

item=sc.nextInt();
for(i=0;i<arr.length;i=i+1)
{
if(item==arr[i])
{
isFound=true;
break;
}
}
if(isFound=true)
{
System.out.println("item is found");
}
else
{
System.out.println("item is  not found");
}

}
}

