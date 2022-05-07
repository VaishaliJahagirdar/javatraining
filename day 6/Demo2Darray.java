// 2D array 

import java.util.*;
class Demo2DArray{
public static void main(String args[]){
int[][] arr=new int[3][3];
Scanner sc=new Scanner(System.in);

int i,j;
System.out.println("enter your array");
for(i=0;i<3;i=i+1) //row index
{
 for(j=0;j<3;j=j+1) //col index
 {
  arr[i][j]=sc.nextInt();

  }
  }
  for(i=0;i<3;i=i+1) //row index
{
 for(j=0;j<3;j=j+1) //col index
 {
  System.out.print( " " +arr[i][j]);

  }

  

//System.out.print( " " +arr[j][i]);




System.out.println();
}
} 
 
 }

