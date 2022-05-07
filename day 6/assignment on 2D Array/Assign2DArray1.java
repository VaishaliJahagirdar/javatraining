// excersise 1 addition of two array element         

/*import java.util.*;
class Assign2DArray1{
public static void main(String args[]){
int[][] arr=new int[3][3];
int[][] arr1=new int[3][3];
Scanner sc=new Scanner(System.in);

int i,j,m,n,sum=0;
System.out.println("enter your array");
for(i=0;i<3;i=i+1) //row index
{
 for(j=0;j<3;j=j+1) //col index
 {
  arr[i][j]=sc.nextInt();
  
  }
   System.out.println("enter your 2nd array");
for(m=0;m<3;m++)
    {
      for(n=0;n<3;n++)
      {
      
        arr1[m][n]=sc.nextInt();
        sum=arr[i][j]+arr1[m][n];  
         
        }
         System.out.print(" sum of array is "+sum); 
           }
    
     System.out.println();
  }
  }
  }*/

import java.util.*;
class matrixaddition
{
public static void main ( String[] args )
{
int i,j,sum;
int[][]arr={
           {1,5,6},
           {6,8,9},
           {8,6,7}};
//int[][]brr={
           //{1,3,4},
           //{2,4,3},
           //{1,2,4}};
           //int[][]sum=new int[3][3];  
for(i=0;i<3;i=i+1) //ROW INDEX
{
for(j=0;j<3;j=j+1)//COL INDEX
{
sum= arr[i][j]+arr[i][j];
System.out.print(sum+" ");
}
System.out.println();
}
}
}
  
  
   
  
  
  
 

