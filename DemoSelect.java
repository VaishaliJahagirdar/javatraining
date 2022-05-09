package first;


import java.sql.*;

public class DemoSelect {
    public static void main(String[] args) throws Exception {
        // Load database driver in memory
        Class.forName("org.postgresql.Driver");
        System.out.println("Driver loaded");
        Connection conn;
        conn = DriverManager.getConnection("jdbc:postgresql://localhost:5432/test1", "postgres", "vaishu");

        System.out.println("Coonection done");

        Statement stmt;
        
        stmt = conn.createStatement();
        String sql;
        sql="select * from student";
        ResultSet rs;
        rs=stmt.executeQuery(sql);
        rs.next();
        System.out.println(rs.getInt("id"));
        System.out.println(rs.getString("name"));

        stmt.executeUpdate(sql);
        
        System.out.println("record inserted");

        conn.close();
    
}
}
