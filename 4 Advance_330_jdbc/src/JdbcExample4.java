
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcExample4 {

    static int getDatabaseCount() {
        int i=0;
        try {
            Connection con = GetConnection.getConnect();
            String query = "SELECT COUNT(*) AS database_count FROM INFORMATION_SCHEMA.SCHEMATA";
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery(query);
            if (rs.next()) {
                 i = rs.getInt(1);
            }
        } catch (SQLException e) {
            System.out.println("Exception : " + e);
        }
        return i;
    }

    public static void main(String[] args) {
        try {
            Connection con = GetConnection.getConnect();
            int databaseCountOld = 0, databaseCountNew = 0;
            databaseCountOld = getDatabaseCount();

            String query = "create database if not exists advance330";
            Statement stmt1 = con.createStatement();
            stmt1.execute(query);

           databaseCountNew = getDatabaseCount();

            if (databaseCountNew > databaseCountOld) {
                System.out.println("Database created successfully");
            } else {
                System.out.println("Database already exist");
            }

        } catch (SQLException e) {
            System.out.println("Exception : " + e);
        }
    }
}
