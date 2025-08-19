import java.sql.*;
public class JdbcExample15 {
    public static void main(String[] args) {
        try {
            Connection con = GetConnection1.getConnect();
            // inner join
            //String query = "select orders.orderid,customers.customername from orders inner join customers on orders.customerid = customers.customerid";
            
            // left outer join
            //String query = "select orders.orderid,customers.customername from orders left outer join customers on orders.customerid = customers.customerid";
            
            // right outer join
            String query = "select orders.orderid,customers.customername from orders right outer join customers on orders.customerid = customers.customerid";
            
            PreparedStatement ps = con.prepareStatement(query);
            ResultSet rs = ps.executeQuery();
                System.out.println("Order Id\tCustomer name");
                System.out.println("------------------------------------------");
            
            while(rs.next()){
                System.out.println(rs.getInt(1)+"\t\t"+rs.getString(2));
            }
        } catch (SQLException e) {
            System.out.println("Exception : " + e);
        }
    }
}
