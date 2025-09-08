package dao;

import config.GetConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class AdminDao {

    public int checkAdminLogin(String email, String password) {
        int i=0;
        try {
            Connection con = GetConnection.getConnect();
            String query = "select * from admin where email=? and password = ?";
            PreparedStatement ps = con.prepareStatement(query);
            ps.setString(1, email);
            ps.setString(2, password);
            ResultSet rs = ps.executeQuery();
            if(rs.next())
                i=1;
        } catch (SQLException e) {
            System.out.println("Exception : " + e);
        }
        return i;
    }
}
