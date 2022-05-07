class Test{
int i; // instant variable:
static int j;

Test (){
// constructor 
i=i+1;
j=j+1;


}
void show(){
System.out.println(i);
System.out.println(j);
}

}
 class DemoClass3{
public static void main(String args[]){
Test t1=new Test();
Test t2=new Test();
Test t3=new Test();

t1.show();
t2.show();  // instance variable 
t3.show();

// each object created  has seprate memory:
}
}