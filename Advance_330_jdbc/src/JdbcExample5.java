
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcExample5 {
    public static void main(String[] args) {
        try {
            Connection con = GetConnection1.getConnect();
            String query = "create table student(studid  int primary key auto_increment,studname varchar(45) not null,email varchar(45) not null,address varchar(45) not null, percentage double default 0)";
            Statement stmt =  con.createStatement();
            stmt.execute(query);
            System.out.println("Table created successfully");
            
        } catch (SQLException e) {
            System.out.println("Exception : " + e);
        }
    }
}
