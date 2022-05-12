//2Write a Program that accepts your name (first name middle name and last name) as command line arguments and generate the output as given below

import java.util.*;
class Name{

    private String fname;
    private String lname;
    
    public String getFname() {
        return fname;
    }
    public String getLname() {
        return lname;
    }
    public void setFname(String fname) {
        this.fname= fname;
    }
    public void setName(String lname) {
        this.lname = lname;
    


}
void cal(){
 Name n=new Name();
    String name1 =n.getFname();
     String name2 = n.getLname();
      System.out.println(name1.toUpperCase());
  System.out.println(name2.toUpperCase());
 
 
}
}

class Demo{
public static void main(String args[]){
    Name n= new Name();
    n.setFname("vaishali");
    
    n.setFname("Jahagirdar");
    n.cal();




}
}