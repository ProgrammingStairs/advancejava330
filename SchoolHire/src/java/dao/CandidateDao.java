package dao;

import config.GetConnection;
import dto.CandidateDto;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class CandidateDao {
    public int addCandidate(CandidateDto candidate){
            Connection con = GetConnection.getConnect();
            int i=0;
            try{
                String query = "insert into candidate(name,email,password,contact,address,date,gender,qualification,experience) values(?,?,?,?,?,?,?,?,?)";
                PreparedStatement ps = con.prepareStatement(query);
                ps.setString(1, candidate.getName());
                ps.setString(2, candidate.getEmail());
                ps.setString(3, candidate.getPassword());
                ps.setString(4, candidate.getContact());
                ps.setString(5, candidate.getAddress());
                ps.setString(6, candidate.getDate());
                ps.setString(7, candidate.getGender());
                ps.setString(8, candidate.getQualification());
                ps.setString(9, candidate.getExperience());
                i = ps.executeUpdate();
            }catch(Exception e){
                System.out.println("Exception : "+e);
            }
            return i;
    }
    
        public int checkCandidateLogin(String email, String password) {
        int i=0;
        try {
            Connection con = GetConnection.getConnect();
            String query = "select * from candidate where email=? and password = ?";
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
