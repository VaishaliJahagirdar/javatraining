class Test{
int i,j;
void add(){
System.out.println(i+j);
}
Test(int x,int y){
i=x;
j=y;
}
}
class DemoReference{
public static void main(String[] args){
Test t1=new Test(10,20);
Test t2=new Test(30,50);

t3=null;  // memory not allocated Test 
t1.add();
t2.add();

 t3=add();   // error not allocate null pointer exception 
}
}
