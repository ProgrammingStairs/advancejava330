
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
public class JdbcExample12 {
    public static void main(String[] args) {
        try {
            String email = "abc@gmail.com";
            Connection con = GetConnection1.getConnect();
       String query = "delete from student where email = ?";
            PreparedStatement ps = con.prepareStatement(query);
            ps.setString(1, email);
            int i = ps.executeUpdate();
            if(i>0)
                System.out.println("Data deleted successfully");
        } catch (SQLException e) {
            System.out.println("Exception : " + e);
        }
    }
}
