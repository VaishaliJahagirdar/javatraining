/*6 .Create a class “Room” which will hold the “height”, “width” and “breadth” of the room in three 
fields(variables). This class also has a method “volume()” to calculate the volume of this room.*/

import java.util.*;
class Room{
int height;
int width;
int breadth;
int volume;

Room()
{
Scanner sc=new Scanner(System.in);
System.out.println(" enter the height of room");
height=sc.nextInt();
System.out.println(" enter the width of room");
width=sc.nextInt();
System.out.println(" enter breadth of room");
breadth=sc.nextInt();
}
void volume(){
// calculate the volume of the room:
volume=height*width*breadth;
System.out.println(" volume of this room is = "+volume);
}
}
class Excersise6{
public static void main(String args[])
{
Room r1=new Room();
r1.volume();
}
}
