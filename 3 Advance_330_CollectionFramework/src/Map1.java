import java.util.*;
public class Map1 
{
    public static void main(String[] args) {
        Map map = new HashMap();
        map.put(101, "Andrew");
        map.put(102, "Mathew");
        map.put("Peter",103);
        map.put("Jackson",104);
        
//        System.out.println("map : "+map);
         Set set =  map.entrySet();
         Iterator itr = set.iterator();
         while(itr.hasNext()){
             Map.Entry m = (Map.Entry)itr.next();
             System.out.print("key : "+m.getKey()+" value : "+m.getValue());
             if(m.getKey().equals(new Integer(102)))
                    System.out.println("-------------Ranker-------------");
             System.out.println();
         }
    }
}
