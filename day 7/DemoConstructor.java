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

 this.id=10;
this.name=name1;
this.balance=balance1;
System.out.println("constructor with argument");
}
void deposit(int amt){
balance+=amt;

System.out.println("balance after deposit");


}
void withDraw(int amt){
balance-=amt;

}
void print(){

System.out.println("**********************************");
System.out.println("id "+id);
System.out.println("name "+name);
System.out.println("balence "+balance);

System.out.println("**********************************");


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
ob2.withDraw(2000);
ob2.print();
}
}