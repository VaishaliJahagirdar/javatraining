// 6 Traingle is valid or not

import java.util.*;
class Traingle{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
int a,b,c;
System.out.println("enter the three angles of traingle");
a=sc.nextInt();
b=sc.nextInt();
c=sc.nextInt();
if((a + b >  c) && (b + c > a) && (a + c > b))
 {
			System.out.println("It is a Valid Triangle");
		}	
else 	
{
			System.out.println("It is Not a Valid Triangle");
		}
      }
      }
      