import java.util.*;

class Account{
int id;
String name;
int balance;
Account(){
id=1;
name="abc";
balance=0;
System.out.println("constructor without argument");
}
Account(int id1,String name1,int balance1){

id1=10;
name=name1;
balance=balance1;
System.out.println("constructor with argument");
}
void deposit(int amt){
balance+=amt;

System.out.println("balance after deposit");


}
void withDraw(int amt){

}
void print(){

System.out.println("balance after deposit");


}


}
class DemoConstructor
{
public static void main ( String[] args )
{
Account ob1=new Account();
Account ob2=new Account(2,"abc",1000);
ob2.deposit(3000);
ob1.deposit(1500);
ob1.print();
ob2.withdraw(2000);
ob2.print();
}
}