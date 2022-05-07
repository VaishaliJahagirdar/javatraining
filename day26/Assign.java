// ASSIGNMENT:

import java.sql.*;
import java.util.*;

public class Assign {
    public static void main(String[] args) throws Exception {
    int id;
    String name;
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the id of student");
    id=sc.nextInt();
    System.out.println("enter the name of student");
    name=sc.next();
    
        // Load database driver in memory
        Class.forName("org.postgresql.Driver");
        System.out.println("Driver loaded");
        Connection conn;
        conn = DriverManager.getConnection("jdbc:postgresql://localhost:5432/test1", "postgres", "vaishu");

        System.out.println("Coonection done");
                 String sql;

        Statement stmt;
        stmt=conn.createStatement();
        sql="insert into student values("+id+",'"+name+"')";    
                stmt.executeUpdate(sql);
       
        System.out.println("record inserted");

        conn.close();



            }
}
