
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;
public class JdbcExample8 {
    public static void main(String[] args) {
        try {
            Connection con = GetConnection1.getConnect();
            
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter Updated student name : ");
            String studname = sc.nextLine();
            System.out.println("Enter email: ");
            String email = sc.nextLine();
            
            String query = "update student set studname='"+studname+"' where email='"+email+"'";
            Statement stmt =  con.createStatement();
            int i = stmt.executeUpdate(query);
            if(i>0)
                System.out.println("Data Updated successfully : "+i);
        } catch (SQLException e) {
            System.out.println("Exception : " + e);
        }
    }
}
