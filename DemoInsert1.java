package first;
import java.sql.*;

public class DemoInsert1 {
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
        sql = "insert into student values(506,'RCB')";
        stmt.executeUpdate(sql);
        System.out.println("record inserted");

        conn.close();

    }

}
    

