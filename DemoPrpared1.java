package first;
import java.sql.*;


public class DemoPrpared1 {
    public static void main(String[] args) throws Exception {
        // Load database driver in memory
        Class.forName("org.postgresql.Driver");
        System.out.println("Driver loaded");
        Connection conn;
        conn = DriverManager.getConnection("jdbc:postgresql://localhost:5432/test1", "postgres", "vaishu");

        System.out.println("Coonection done");
        

        PreparedStatement stmt;
        
        
        String sql;
        sql="insert into student values(?,?)";
       
       stmt=conn.prepareStatement(sql);
       stmt.setInt(1,190);
       stmt.setString(2,"bnb");

       

        stmt.executeUpdate();
        
        System.out.println("record inserted");

        conn.close();
    
}
}
    

