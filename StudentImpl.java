package first;
import java.sql.*;

public class StudentImpl implements StudentInterface {

    @Override
    public void save(Student st) {
        // TODO Auto-generated method stub
        String sql;
        String name = st.getName();
        int id = st.getId();
        sql = "insert into student values(id="+id+",name='" + name + "')";
        try {
            // Load database driver in memory
            Class.forName("org.postgresql.Driver");
            System.out.println("Driver loaded");
            Connection conn;
            conn = DriverManager.getConnection("jdbc:postgresql://localhost:5432/test1", "postgres", "vaishu");
            System.out.println("Coonection done");
            Statement stmt;
            stmt = conn.createStatement();
            stmt.executeUpdate(sql);
            System.out.println("record inserted");

            conn.close();
        } catch (Exception e) {
            // TODO: handle exception
        }

        
    }

    @Override
    public void update(Student st) {
        // TODO Auto-generated method stub
        String sql;
        String name = st.getName();
        int id = st.getId();
        sql = "update student set name='" + name + "' where id=" + id;
        try {
            // Load database driver in memory
            Class.forName("org.postgresql.Driver");
            System.out.println("Driver loaded");
            Connection conn;
            conn = DriverManager.getConnection("jdbc:postgresql://localhost:5432/test1", "postgres", "vaishu");
            System.out.println("Coonection done");
            Statement stmt;
            stmt = conn.createStatement();
            stmt.executeUpdate(sql);
            System.out.println("record Updated");

            conn.close();
        } catch (Exception e) {
            // TODO: handle exception
        }

        
    }

    @Override
    public void delete(Student st) {
        // TODO Auto-generated method stub
        String sql;
        String name = st.getName();
        int id = st.getId();
        sql = "delete from student where  id="+id;
        try {
            // Load database driver in memory
            Class.forName("org.postgresql.Driver");
            System.out.println("Driver loaded");
            Connection conn;
            conn = DriverManager.getConnection("jdbc:postgresql://localhost:5432/test1", "postgres", "vaishu");
            System.out.println("Coonection done");
            Statement stmt;
            stmt = conn.createStatement();
            stmt.executeUpdate(sql);
            System.out.println("record deleted");

            conn.close();
        } catch (Exception e) {
            // TODO: handle exception
        }
    }

    @Override
    public Student getStud(int id) {
         Student st=null;
      try {

        Class.forName("org.postgresql.Driver");
        System.out.println("Driver loaded");
        Connection conn;
        conn = DriverManager.getConnection("jdbc:postgresql://localhost:5432/test1", "postgres", "vaishu");

        System.out.println("Coonection done");

        Statement stmt;
        
        stmt = conn.createStatement();
        String sql;
        sql="select * from student where id="+id;
        ResultSet rs;
        rs=stmt.executeQuery(sql);
         while(rs.next()){
             st=new Student();
             st.setId(rs.getInt("id"));
             st.setName(rs.getString("name"));
        // System.out.println(rs.getInt("id"));
        // System.out.println(rs.getString("name"));
         }

        stmt.executeUpdate(sql);
        
        System.out.println("record inserted");

        conn.close();
      } catch (Exception e) {
          //TODO: handle exception
      }

        return st;
    }

    
}
