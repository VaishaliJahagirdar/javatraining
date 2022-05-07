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