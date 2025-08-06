import java.util.*;
public class Map4 
{
    public static void main(String[] args) {
        Map<String,String> map = new TreeMap<>();
        String str[][] = {
            {"color1","Red"},
            {"color2","Green"},
            {"color3","Blue"}
        };
                
        for(String  arr[] : str){
            map.put(arr[0], arr[1]);
        }        
        
        System.out.println("Result : "+map);
    }
}
