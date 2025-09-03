package dbConfig;
import java.sql.Connection;
import java.sql.DriverManager;
public class GetConnection {
    private static final String DRIVER_NAME = "com.mysql.cj.jdbc.Driver";
    private static final String URL = "jdbc:mysql://localhost:3306/city_state";
    private static final String USER = "root";
    private static final String PASS = "root";
    
    public static Connection getConnect(){
        Connection con=null;
        try{
                Class.forName(DRIVER_NAME);
                con = DriverManager.getConnection(URL,USER,PASS);
                if(con!=null)
                        System.out.println("Connection established successfully");
        }catch(Exception e){
            System.out.println("Exception : "+e);
        }    
        return con;
    }
}
