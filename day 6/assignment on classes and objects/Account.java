/*3 Create classes that capture bank customers and bank accounts. 
A customer has a first and last 
name. An account has a customer and a balance. 
Make objects for two accounts held by the same customer.*/

class Account 
{
//attributes
int id;
String name;
int balance;
Account()
{
id=181900029;
name="Aarti Wetal";
balance=5000;
System.out.println("Constructor without arrgument called");
}
void show()
{
System.out.println(" Id number of Account Holder:"+id );
System.out.println("Name of the Account Holder: "+name);
System.out.println(" Balance: "+balance);
}
}
/*Account2(int id1,String name1,int balance1)
{
this.id= id1;
this.name=name1;
this.balance=balance1;
System.out.println("Constructor with arrgument called");
}
/*void show2()
{
System.out.println(" Id number of Account Holder:"+id2 );
System.out.println("Name of the Account Holder: "+name2);
System.out.println(" Balance: "+balance2);
}*/
class Democonstructor
{
public static void main(String[]args)
{
Account ob1=new Account();
/*Account2 ob2=new Account2();
ob1.show();
ob2.id1(1819000926);
ob2.name1("Pooja Patil");
ob2.balance1(2000);*/
}
}