/*3
Given a string, return a new string made of n copies of the first 2 chars of the original string 
where n is the length of the string. The string may be any length. If there are fewer than 2 chars, 
use whatever is there. If input is "Wipro" then output should be "WiWiWiWiWi".*/
import java.util.*;
 class AssignString3 {

        public static void main(String[] args) {
        
        Scanner sc= new Scanner(System.in);
        String next="";
        System.out.println("Enter the string");       
        String abc= sc.nextLine();
        int lenght =abc.length();
        if(lenght<=1){
            next=abc;
           
        }
        else{
            for (int i=0;i<lenght;i++)
            {
                next=next+abc.charAt(0)+abc.charAt(1);
            }
        }
        System.out.print(next);
  

    }

}
