/*import java.util.*;
class Assign2DArray2{
public static void main(String args[]){
int[][] arr=new int[2][2];
Scanner sc=new Scanner(System.in);

int i,j,mul=1;
System.out.println("enter your array");
for(i=0;i<=2;i=i+1) //row index
{
 for(j=0;j<=2;j=j+1) //col index
 {
  arr[i][j]=sc.nextInt();
  
  mul=mul*arr[i][j];
   
  System.out.print( " " +mul);
   

  }
  }
  
}
} */
//WAP TO MATRIX MULTIPLICATION
import java.util.*;
class matrixaddition
{
public static void main ( String[] args )
{
int i,j,mul;
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
mul= arr[i][j]*arr[i][j];
System.out.print(mul+" ");
}
System.out.println();
}
}
}
 
