// VARIABLES:

class Demo{
int i;  // global variable:
Demo(int i){
//i=i; // constructor variable ,local variable:
// for execute local variablr use
this.i=i;
}
void show(){
System.out.println(i); // called global variable:
}

}
class DemoThis{
public static void main ( String[] args )
{
Demo ob1=new Demo(10);
ob1.show();
}
} 