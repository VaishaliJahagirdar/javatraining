/* 2Create a class that captures planets.
Each planet has a name,
a distance from the sun, 
and its gravity relative to Earth’s gravity. 
For distance and gravity,
use the type double which captures 
real numbers. Make objects for Earth and your favorite non-earth planet.*/
import java.util.*;
class Planet
{
// attrinute of Plantes;
String planet_name;
Double Distance_from_sun, gravity_relative_to_Earths_gravity ;
Scanner sc=new Scanner(System.in);

Planet()
{
System.out.println(" enter the planet name");
planet_name=sc.next();
System.out.println(" Enter distance from the sun");
Distance_from_sun=sc.nextDouble();
System.out.println(" Enter gravity relative to Earth’s gravity");
gravity_relative_to_Earths_gravity=sc.nextDouble();
}
void show()
{
System.out.println("  Planet name :"+planet_name);
System.out.println(" Distance from the sun: "+Distance_from_sun);
System.out.println(" gravity relative to Earth’s gravity "+gravity_relative_to_Earths_gravity);
}
}
class  Planets
{
public static void main(String[] args)
{
 Planet st=new  Planet();
st.show();

}
}




