import java.util.*;
public class Map2 
{
    public static void main(String[] args) {
        Map<Integer,String> map = new HashMap();
        map.put(101, "Andrew");
        map.put(102, "Mathew");
        map.put(103,"Peter");
        map.put(104,"Jackson");
        
//        System.out.println("map : "+map);
           for(Map.Entry m : map.entrySet()){
             System.out.print("key : "+m.getKey()+" value : "+m.getValue());
             if(m.getKey().equals(new Integer(102)))
                    System.out.println("-------------Ranker-------------");
             System.out.println();
         }
    }
}
