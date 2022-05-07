//WAP TO IDENTIFY THAT GIVEN TRAIMGLE IS LOWER TRANGULAR OR NOT:
import java.util.*;

class LowerTraingular{
    public static void main(String args[]) {
      
        int row, col;
        boolean isLowerTriangular = false;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter total number of rows : ");
        row = scanner.nextInt();

        
        System.out.println("Enter total number of columns : ");
        col = scanner.nextInt();

       
        int arr[][] = new int[row][col];

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.println("Enter element for array[" + (i + 1) + "," + (j + 1) + "] : ");
                arr[i][j] = scanner.nextInt();
            }
        }


        System.out.println("You have entered : ");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
for (int i = 0; i < row; i++) 
        {
            for (int j = 0; j < i; j++)
             {
                if (arr[i][j] == 0) 
                {
                    isLowerTriangular = true;
                    break;
                }
            }
            if (isLowerTriangular) 
            {
                break;
            }
        }

        
        if(!isLowerTriangular)
        {
            System.out.println("lower triangular matrix.");
        }
        else
        {
            System.out.println("Not an lower triangular matrix.");
        }
    }
} 
 
