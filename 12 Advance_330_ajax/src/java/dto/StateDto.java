package dto;
import java.io.Serializable;
public class StateDto implements Serializable{
    private int stateid;
    private String statename;

    public StateDto() {
    }

    public int getStateid() {
        return stateid;
    }

    public void setStateid(int stateid) {
        this.stateid = stateid;
    }

    public String getStatename() {
        return statename;
    }

    public void setStatename(String statename) {
        this.statename = statename;
    }
    
}
