// WAP TO IDENTIFY GIVEN MATRIX IS IDENTITY MATRIX OR NOT:

import java.util.*;

 class Main {

    public static void main(String[] args) {
       
        Scanner sc = new Scanner(System.in);
        int size;

        System.out.println("Enter the size of the matrix :");
        size = sc.nextInt();

       
        for (int i = 0; i < size; i++)
         {
            
            for (int j = 0; j < size; j++) 
            {
                
                if (i == j) 
                {
                    System.out.print("1 ");
                } 
                else
                 {
                    System.out.print("0 ");
                }
            }
          
            System.out.println();
        }

    }

} 