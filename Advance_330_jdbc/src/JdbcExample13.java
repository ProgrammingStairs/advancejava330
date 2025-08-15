
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
public class JdbcExample13 {
    public static void main(String[] args) {
        try {
            Connection con = GetConnection1.getConnect();
       String query = "select * from student";
            PreparedStatement ps = con.prepareStatement(query);
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                System.out.println("\nstudent id : "+rs.getInt(1));
                System.out.println("student name : "+rs.getString(2));
                System.out.println("student email : "+rs.getString(3));
                System.out.println("student address : "+rs.getString(4));
                System.out.println("student percentage : "+rs.getDouble(5));
            }
        } catch (SQLException e) {
            System.out.println("Exception : " + e);
        }
    }
}
