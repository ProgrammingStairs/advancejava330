package dao;

import config.GetConnection;
import dto.AppliedVacancyDto;
import dto.CandidateDto;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class AppliedVacancyDao {
    public int candidateAppliedVacancy(int candidateId,String candidateName,String email,int vacancyId,String vacancyName,String applyStatus){
         Connection con = GetConnection.getConnect();
            int i=0;
            try{
                String query = "insert into appliedVacancy(candidateId,candidateName,email,vacancyId,vacancyName,applyStatus) values(?,?,?,?,?,?)";
                PreparedStatement ps = con.prepareStatement(query);
                ps.setInt(1, candidateId);
                ps.setString(2, candidateName);
                ps.setString(3, email);
                ps.setInt(4, vacancyId);
                ps.setString(5, vacancyName);
                ps.setString(6, applyStatus);
                i = ps.executeUpdate();
            }catch(Exception e){
                System.out.println("Exception : "+e);
            }
            return i;
    }
        public boolean checkCandidateJobApply(int candidateId,int vacancyId){
            boolean status = false;
            try {
            Connection con = GetConnection.getConnect();
            String query = "select * from appliedvacancy where candidateId=? and vacancyId=?";
            PreparedStatement ps = con.prepareStatement(query);
            ps.setInt(1, candidateId);
            ps.setInt(2, vacancyId);
            ResultSet rs = ps.executeQuery();
            if(rs.next())
                status = true;
        } catch (SQLException e) {
            System.out.println("Exception : " + e);
        }
        return status;
    }    

        public ArrayList<AppliedVacancyDto> getCandidateVacancyList(String email){
            ArrayList<AppliedVacancyDto> list = new ArrayList<>();
            try{
                    Connection con = GetConnection.getConnect();
                    String query = "select * from appliedvacancy where email = ?";
                    PreparedStatement ps = con.prepareStatement(query);
                    ps.setString(1, email);
                    ResultSet rs = ps.executeQuery();
                    while(rs.next()){
                        AppliedVacancyDto applied = new AppliedVacancyDto();
                        applied.setAppliedVacancyId(rs.getInt(1));
                        applied.setCandidateId(rs.getInt(2));
                        applied.setCandidateName(rs.getString(3));
                        applied.setEmail(rs.getString(4));
                        applied.setVacancyId(rs.getInt(5));
                        applied.setVacancyName(rs.getString(6));
                        applied.setApplyStatus(rs.getString(7));
                        list.add(applied);
                    }
            }catch(Exception e){
                System.out.println("Exception : "+e);
            }
            return list;
        }
        
           public ArrayList<AppliedVacancyDto> getAppliedCandidateList(){
            ArrayList<AppliedVacancyDto> list = new ArrayList<>();
            try{
                    Connection con = GetConnection.getConnect();
                    String query = "select * from appliedvacancy";
                    PreparedStatement ps = con.prepareStatement(query);
                    ResultSet rs = ps.executeQuery();
                    while(rs.next()){
                        AppliedVacancyDto applied = new AppliedVacancyDto();
                        applied.setAppliedVacancyId(rs.getInt(1));
                        applied.setCandidateId(rs.getInt(2));
                        applied.setCandidateName(rs.getString(3));
                        applied.setEmail(rs.getString(4));
                        applied.setVacancyId(rs.getInt(5));
                        applied.setVacancyName(rs.getString(6));
                        applied.setApplyStatus(rs.getString(7));
                        list.add(applied);
                    }
            }catch(Exception e){
                System.out.println("Exception : "+e);
            }
            return list;
        }
        
}
