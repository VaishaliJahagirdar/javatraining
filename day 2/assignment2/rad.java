/*It is sometimes hard to think in terms of radians; we would rather use degrees. Remember (from 
those dark days of trigonometry class) that there are PI radians per 180 degrees. So to convert an 
angle given in degrees to radians do this: 
example 7*/
import java.util.*;

public class rad
{
public static void main(String[] args){
Scanner sc = new Scanner(System.in);
System.out.println("Enter Angle");
int degree= sc.nextInt();
double rad = (degree* Math.PI)/180;
System.out.println(rad);
}
}