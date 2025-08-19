
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class GetConnection1 {
    public static Connection getConnect(){
            Connection con = null;
            try{
                      Class.forName(GetDetails.DRIVER);
                      con = DriverManager.getConnection(GetDetails.URL, GetDetails.USER, GetDetails.PASSWORD);
            }catch(ClassNotFoundException | SQLException e){
                System.out.println("Exception : "+e);
            }
            return con;
    }
}
