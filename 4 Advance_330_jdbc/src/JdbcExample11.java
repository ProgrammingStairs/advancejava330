
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;
public class JdbcExample11 {
    public static void main(String[] args) {
        try {
            Connection con = GetConnection1.getConnect();
            
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter student name : ");
            String studname = sc.nextLine();
            System.out.println("Enter email: ");
            String email = sc.nextLine();
            System.out.println("Enter address : ");
            String address = sc.nextLine();
            System.out.println("Enter student percentage : ");
            double percentage = sc.nextDouble();
            
     String query = "insert into student(studname,email,address,percentage) values(?,?,?,?)";
            PreparedStatement ps = con.prepareStatement(query);
            ps.setString(1, studname);
            ps.setString(2, email);
            ps.setString(3, address);
            ps.setDouble(4, percentage);
            int i = ps.executeUpdate();
            if(i>0)
                System.out.println("Data Inserted successfully");
        } catch (SQLException e) {
            System.out.println("Exception : " + e);
        }
    }
}
