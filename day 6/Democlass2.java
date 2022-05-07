// INSTANCE VARIABLE:

class Test{
int i;
//void setI(int x){
//i=0;
//}
Test (){
// constructor 
i=20;
System.out.println(" using constructor");

}
void show(){
System.out.println(i);
}

}
 class DemoClass2{
public static void main(String args[]){
Test t1=new Test();

t1.show();
}
}