package dao;

import dbConfig.GetConnection;
import dto.CityDto;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class CityDao {
    public ArrayList<CityDto> getCityList(int stateId){
        ArrayList<CityDto> list = new ArrayList<>();
        Connection con = GetConnection.getConnect();
        try{
            String query = "select * from city where stateid = ?";
            PreparedStatement ps = con.prepareStatement(query);
            ps.setInt(1, stateId);
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                CityDto city = new CityDto();
                city.setCityid(rs.getInt(1));
                city.setStateid(rs.getInt(2));
                city.setCityname(rs.getString(3));
                list.add(city);
            }
        }catch(Exception e){
            System.out.println("Exception : "+e);
        }
        return list;
    }
}
