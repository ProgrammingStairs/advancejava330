import java.util.*;
public class Map3 
{
    public static void main(String[] args) {
        Map<Integer,String> map = new HashMap();
        map.put(101, "Andrew");

        Map<Integer,Map> mapLink= new LinkedHashMap<>();
        mapLink.put(102, map);

//        System.out.println("map : "+map);
           for(Map.Entry m : mapLink.entrySet()){
             System.out.println("key : "+m.getKey()+" value : "+m.getValue());
            Object x = m.getValue();
             // Cast x to Map
            Map<Integer, String> innerMap = (Map<Integer, String>) x;

            // Extract keys from inner map
            for (Integer innerKey : innerMap.keySet()) {
                System.out.println("Inner key: " + innerKey);
            }
            
              for (Map.Entry innerKey : innerMap.entrySet()) {
                System.out.println("Inner key: " + innerKey.getKey()+" value : "+innerKey.getValue());
            }
         }
    }
}
