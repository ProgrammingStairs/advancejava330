
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class GetConnection {
    private final static String DRIVER = "com.mysql.cj.jdbc.Driver";
    private final static String URL =  "jdbc:mysql://localhost:3306";
    private final static String USER = "root";
    private final static String PASSWORD = "root";

    public static Connection getConnect(){
            Connection con = null;
            try{
                      Class.forName(DRIVER);
                      con = DriverManager.getConnection(URL, USER, PASSWORD);
            }catch(ClassNotFoundException | SQLException e){
                System.out.println("Exception : "+e);
            }
            return con;
    }
}
