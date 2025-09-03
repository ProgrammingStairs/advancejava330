package dao;

import dbConfig.GetConnection;
import dto.StateDto;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class StateDao {
    public ArrayList<StateDto> getStateList(){
        ArrayList<StateDto> list = new ArrayList<>();
        Connection con = GetConnection.getConnect();
        try{
            String query = "select * from state";
            PreparedStatement ps = con.prepareStatement(query);
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                StateDto state = new StateDto();
                state.setStateid(rs.getInt(1));
                state.setStatename(rs.getString(2));
                list.add(state);
            }
        }catch(Exception e){
            System.out.println("Exception : "+e);
        }
        return list;
    }
}
