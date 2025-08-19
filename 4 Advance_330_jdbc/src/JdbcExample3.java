
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
public class JdbcExample3 {
    
    private static String DRIVER = "com.mysql.cj.jdbc.Driver";
    private static String URL =  "jdbc:mysql://localhost:3306";
    private static String USER = "root";
    private static String PASSWORD = "root";
    
    public static void main(String[] args) {
        try{
            
            Class.forName(DRIVER);
            Connection con = DriverManager.getConnection(URL, USER, PASSWORD);
    
            if(con!=null){
                System.out.println("Connection established successfully");
            }else
                System.out.println("Error while making connection");
            
            String queryCount = "SELECT COUNT(*) AS database_count FROM INFORMATION_SCHEMA.SCHEMATA";
            Statement stmt = con.createStatement();
            ResultSet rs =  stmt.executeQuery(queryCount);
            int databaseCountOld=0,databaseCountNew=0;
            if(rs.next())
                databaseCountOld = rs.getInt(1);
            
            String query = "create database if not exists advance330";
            Statement stmt1 = con.createStatement();
            stmt1.execute(query);
            
            String queryCount1 = "SELECT COUNT(*) AS database_count FROM INFORMATION_SCHEMA.SCHEMATA";
            Statement stmt2 = con.createStatement();
            ResultSet rs1 =  stmt2.executeQuery(queryCount);
            if(rs1.next())
                databaseCountNew = rs1.getInt(1);
            
            if(databaseCountNew>databaseCountOld)
                System.out.println("Database created successfully");
            else
                   System.out.println("Database already exist");
            
        }catch(ClassNotFoundException | SQLException e){
            System.out.println("Exception : "+e);
        }
    }
}
