/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package first;

import java.sql.*;

public class App {
    public String getGreeting() {
        return "Hello World!";
    }

    
    public static void main(String[] args) {
       
        Student st=new Student();
        st.setId(10000);
        st.setName("test");

        StudentImpl ob;
        ob=new StudentImpl();
         //ob.update(st);
        //ob.delete(st);
    //   Student st1=  ob.getStud(506);
    //   System.out.println(st1.getId());
    //   System.out.println(st1.getName());
      ob.save(st);
    }
}

        
        
    


