class Test implements Runnable{
Thread t;
Test(){
t=new Thread(this);
t.start();
}
@Override
public void run(){
try{
for(int i=0;i<5;i++)
{
System.out.println("child thread:"+i);
Thread.sleep(500);
}
}catch(Exception e){

}
}
}
class Demo{
public static void main(String args[]){
Test t1=new Test();
try{
for(int i=0;i<5;i++)
{
System.out.println("parent thread:"+i);
Thread.sleep(1000);
}
}catch(InterruptedException e){
}
}
}
