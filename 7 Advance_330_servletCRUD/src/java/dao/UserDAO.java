package dao;

import dbConfig.GetConnection;
import dto.UserDTO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class UserDAO {
    public int addUser(UserDTO userObj){
        int i=0;
        try{
                Connection con = GetConnection.getConnect();
                String query = "insert into user(username,email,password,address) values(?,?,?,?)";
                PreparedStatement ps =  con.prepareStatement(query);
                ps.setString(1, userObj.getUsername());
                ps.setString(2, userObj.getEmail());
                 ps.setString(3, userObj.getPassword());
                  ps.setString(4, userObj.getAddress());
                i = ps.executeUpdate();
        }catch(Exception e){
            System.out.println("Exception : "+e);
        }
        return i;
    }
    
        public int loginUser(String email,String password){
        int i=0;
        try{
                Connection con = GetConnection.getConnect();
                String query = "select * from user where email=? and password=?";
                PreparedStatement ps =  con.prepareStatement(query);
                ps.setString(1, email);
                 ps.setString(2, password);
                ResultSet rs = ps.executeQuery();
                if(rs.next())
                    i=1;
           }catch(Exception e){
            System.out.println("Exception : "+e);
        }
        return i;
    }
        
     public List<UserDTO> getAllUsersList(){
         List<UserDTO> list = new ArrayList<>();
         try{
                    Connection con = GetConnection.getConnect();
                    String query = "select * from user";
                    PreparedStatement ps = con.prepareStatement(query);
                    ResultSet rs = ps.executeQuery();
                    while(rs.next()){
                        UserDTO user = new UserDTO();
                            user.setUserId(rs.getInt(1));
                            user.setUsername(rs.getString(2));
                            user.setEmail(rs.getString(3));
                            user.setPassword(rs.getString(4));
                            user.setAddress(rs.getString(5));
                            list.add(user);
                    }
                 //   System.out.println(list);
            }catch(Exception e){
                System.out.println("Exception : "+e);
            }
         return list;
     }   
     
     public int deleteEmail(String email){
        int i=0;
        try{
                Connection con = GetConnection.getConnect();
                String query = "delete from user where email=?";
                PreparedStatement ps =  con.prepareStatement(query);
                ps.setString(1, email);
                i = ps.executeUpdate();
           }catch(Exception e){
            System.out.println("Exception : "+e);
        }
        return i;
    }

}
