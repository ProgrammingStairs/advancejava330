
import java.util.*;
public class ArrayList7 {
    public static void main(String[] args) {
          ArrayList<Integer> list = new ArrayList<>();
          list.add(10);
          list.add(2300);
          list.add(30890);
          list.add(40);
          list.add(2500);
          System.out.println("List : "+list);
          
          System.out.println("Minimum : "+Collections.min(list));
          System.out.println("Maximum: "+Collections.max(list));
          Collections.sort(list);
          System.out.println("sorted list elements : "+list);
           Collections.shuffle(list);
           System.out.println("Shuffle : "+list);
           Collections.reverse(list);
           System.out.println("Reverse : "+list);
       }
}
