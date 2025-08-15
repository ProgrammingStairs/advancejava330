import java.sql.*;
public class JdbcExample14 {
    public static void main(String[] args) {
        try {
            Connection con = GetConnection1.getConnect();
            DatabaseMetaData dbmd = con.getMetaData();
            System.out.println("Database product name : "+dbmd.getDatabaseProductName());
         System.out.println("Database product version : "+dbmd.getDatabaseProductVersion());
            System.out.println("Driver name : "+dbmd.getDriverName());
            System.out.println("Driver version : "+dbmd.getDriverVersion());
            
            String query = "select * from student";
            PreparedStatement ps = con.prepareStatement(query);
            ResultSet rs = ps.executeQuery();
            ResultSetMetaData rsmd = rs.getMetaData();
            System.out.println("column name : "+rsmd.getColumnName(2));
            System.out.println("column type name : "+rsmd.getColumnTypeName(2));
            System.out.println("Column count : "+rsmd.getColumnCount());
        } catch (SQLException e) {
            System.out.println("Exception : " + e);
        }
    }
}
