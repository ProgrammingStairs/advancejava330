import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
public class JdbcExample18 {
    public static void main(String[] args) {
        try {
            Connection con = GetConnection1.getConnect();
            
            String query = "select * from student";
      PreparedStatement ps =  con.prepareStatement(query,ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE);
      ResultSet rs = ps.executeQuery();
           
      while(rs.next()){
                   if(rs.getInt(1)==3){
                       rs.updateInt(1, 555);
                       rs.updateString(2, "noname");
                       rs.updateRow();
                   } 
                   System.out.println("\nStudent Id : "+rs.getInt(1)); 
                   System.out.println("Student name : "+rs.getString(2)); 
                   System.out.println("Student email : "+rs.getString(3)); 
                   System.out.println("Student address : "+rs.getString(4)); 
                   System.out.println("Student percentage : "+rs.getDouble(5)); 
            }   
        } catch (SQLException e) {
            System.out.println("Exception : " + e);
        }
    }
}
