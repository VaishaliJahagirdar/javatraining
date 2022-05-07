/*Exercise 5 — Town Dump
The New Britain, Connecticut town dump charges you $20 to dispose of 200 pounds of trash. 
They charge $8 for each additional hundred pounds beyond the first 200. Write a program that 
asks for the weight of a load of trash and then calculates the charge.*/

class TownDump{

public static void main(String[] args){

   int a=600,c;
   int total=0;
   total+=20;
   a=a-200;
   if(a>0)
   {
         c=a/100;
         c=c*8;
         total+=c;
         System.out.println(total);
   }

}
}