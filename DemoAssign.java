package first;
import java.sql.*;
import java.util.*;

 class DemoAssign {
    
   
        
           public static void main(String args[]) throws Exception
           {
             Scanner sc=new Scanner(System.in);
             Class.forName("org.postgresql.Driver");
             Connection conn;
             conn = DriverManager.getConnection("jdbc:postgresql://localhost:5432/test1", "postgres", "vaishu");
        
             int ch;
             Statement stmt;
             stmt=conn.createStatement();
             String sql;
             while(true)
             {
                    System.out.println("**start operation**");
                    System.out.println("Which operation Do you want to perform?");
                    System.out.println("Press 1- for Insert");
                    System.out.println("Press 2- for Delete");
                    System.out.println("Press 3- for Update");
                    System.out.println("Press 4- for select");
                    System.out.println("Press 5- for Exit");
                    System.out.println("Please choose your operation");
                    ch=sc.nextInt();
                    switch(ch)
                    {
                          case 1:   System.out.println("Firing INSERT Query");
                                    System.out.println("Enter student Id: ");
                                    int id=sc.nextInt();
                                   System.out.println("Enter student Name: ");
                                    String name=sc.next();
                                   sql="insert into student values("+id+",'"+name+"')";
                                    stmt.executeUpdate(sql);
                                     System.out.println("Record inserted Successfully");
                                     break;
        
                         case 2:   System.out.println("Firing delete Query");
                                   System.out.println("Enter student id  to be deleted ");
                                    int id1=sc.nextInt();
                                   sql="delete from student where id="+id1+"";
                                    stmt.execute(sql);
                                   System.out.println("Record DELETED Successfully");
                                    break;
        
                          case 3:   System.out.println("Firing UPADATE query");
                                    System.out.println("Enter student the name of student u want to update ");
                                    int id2=sc.nextInt();
                                    String name1=sc.next();
                                   sql="update student set name='" + name1 + "' where id=" + id2;                                   
                                    stmt.executeUpdate(sql);              
                                    System.out.println("Record updated Successfully");
                                    break;
        
                          case 4:   System.out.println("Firing SELECT Query");
                                    System.out.println("Enter student ID to select Record");
                                    int id3=sc.nextInt();
                                    sql="select * from Library where id="+id3+"";
                                   System.out.println(sql);
                                   break;
        
                         case 5:    System.out.println("You have Exit from operation");
                                     System.exit(0);
        
                         default:   System.out.println("You have Entered Wrong input");
                                    break;
                    }
                    System.out.println("**operation end**");
             }
        
           }
        } 
            
        
        
    


