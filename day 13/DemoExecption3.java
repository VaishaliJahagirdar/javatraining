//EXAMPLE:

import java.util.*;


class DemoExecption3{
static int div(int x, int y){
int z=0;

try{
z=x/y;

}catch(ArithmeticException e){
throw e;

}
return z;
}

public static void main(String args[]){  //WHEN THERE IS EXCEPTION  IN CALLED FUNCTION 
int a;
//a=div(10,0);
//System.out.println("div is "+a);


try{
a=div(10,0);
System.out.println("div is "+a);
}catch(ArithmeticException e){
System.out.println("cannot devided by 0");
}



}









}