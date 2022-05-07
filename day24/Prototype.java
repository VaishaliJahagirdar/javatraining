//EXAMPLE OF PROTOTYPE DESIGN PATTERN
//ASSIGNMENT NO 3
//CREAT A NEW  BANK ACCOUNT 


import java.util.ArrayList;

class Account implements Cloneable {
    ArrayList<String> ar;

    Account() {
        ar = new ArrayList<>();

    }

     Account(ArrayList<String> t) {
        ar = t;
    }

    void loadData() {
        ar.add("Phone no. of user");
        ar.add("Name of account user");
        ar.add("Address of user");
        ar.add("Pan number");

    }

    void show() {
        System.out.println("====================");
        for (String s : ar) {
            System.out.println(s);
        }
        System.out.println("====================");
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {

        ArrayList<String> ar2;
        ar2 = new ArrayList<>();
        for (String s : ar) {
            ar2.add(s);
        }
        Account obj = new Account(ar2);
        return obj;
    }
}
 class Prototype {
    public static void main(String[] args)throws Exception
     {
        Account a1=new  Account();
        a1.loadData();
        a1.show();
          Account a2=( Account)a1.clone(); 
       // Student st2=st1;
        a2.show();
        a2.ar.remove("Pan number");
        System.out.println("**a1 object**");
        a1.show();
        System.out.println("**a2 object**");
        a2.show();

    }
}
