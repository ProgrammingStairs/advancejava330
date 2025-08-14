
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcExample6 {
    public static void main(String[] args) {
        try {
            Connection con = GetConnection1.getConnect();
            String query = "insert into student(studname,email,address,percentage) values('Andrew Anderson','andrew@gmail.com','Indore',89)";
            Statement stmt =  con.createStatement();
            int i = stmt.executeUpdate(query);
            if(i>0)
                System.out.println("Data Inserted successfully");
        } catch (SQLException e) {
            System.out.println("Exception : " + e);
        }
    }
}
