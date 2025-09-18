package dao;

import config.GetConnection;
import dto.VacancyDto;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class VacancyDao {
        public int addVacancy(VacancyDto vacancy){
                 Connection con = GetConnection.getConnect();
            int i=0;
            try{
                String query = "insert into vacancy(vacancyName,criteria,jobType,jobMode,vacancy,salary,location,timings,bond,genderPre,joiningStatus,advDate,lastDate,reallocate) values(?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
                PreparedStatement ps = con.prepareStatement(query);
                ps.setString(1, vacancy.getVacancyName());
                ps.setString(2, vacancy.getCriteria());
                ps.setString(3, vacancy.getJobType());
                ps.setString(4, vacancy.getJobMode());
                ps.setInt(5, vacancy.getVacancy());
                ps.setString(6, vacancy.getSalary());
                ps.setString(7, vacancy.getLocation());
                ps.setString(8, vacancy.getTimings());
                ps.setString(9, vacancy.getBond());
                ps.setString(10, vacancy.getGenderPre());
                ps.setString(11, vacancy.getJoiningStatus());
                ps.setString(12, vacancy.getAdvDate());
                ps.setString(13, vacancy.getLastDate());
                ps.setString(14, vacancy.getReallocate());
            
                i = ps.executeUpdate();
            }catch(Exception e){
                System.out.println("Exception : "+e);
            }
            return i;
        }
        
           public ArrayList<VacancyDto> candidateViewVacancy(){
                ArrayList<VacancyDto> list = new ArrayList<>();
                 Connection con = GetConnection.getConnect();
            int i=0;
            try{
                String query = "select * from vacancy";
                PreparedStatement ps = con.prepareStatement(query);
                ResultSet rs = ps.executeQuery();
                while(rs.next()){
                    VacancyDto vacancy = new VacancyDto();
                    vacancy.setVacancyId(rs.getInt(1));
                    vacancy.setVacancyName(rs.getString(2));
                    vacancy.setCriteria(rs.getString(3));
                    vacancy.setJobType(rs.getString(4));
                    vacancy.setJobMode(rs.getString(5));
                    vacancy.setVacancy(rs.getInt(6));
                    vacancy.setSalary(rs.getString(7));
                    vacancy.setLocation(rs.getString(8));
                    vacancy.setTimings(rs.getString(9));
                    vacancy.setBond(rs.getString(10));
                    vacancy.setGenderPre(rs.getString(11));
                    vacancy.setJoiningStatus(rs.getString(12));
                    vacancy.setAdvDate(rs.getString(13));
                    vacancy.setLastDate(rs.getString(14));
                    vacancy.setReallocate(rs.getString(15));
                    vacancy.setStatus(rs.getInt(16));
                    list.add(vacancy);
                }
            }catch(Exception e){
                System.out.println("Exception : "+e);
            }
            return list;
        }

}
