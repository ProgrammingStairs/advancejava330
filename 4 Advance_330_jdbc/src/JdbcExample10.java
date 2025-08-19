import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
public class JdbcExample10 {
    public static void main(String[] args) {
        try {
            Connection con = GetConnection1.getConnect();
            
            String query = "select * from student";
            Statement stmt =  con.createStatement();
            ResultSet rs = stmt.executeQuery(query);
            while(rs.next()){
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
