
import java.util.*;
public class ArrayList6 {
    public static void main(String[] args) {
          ArrayList<Integer> list1 = new ArrayList<>();
          list1.add(100);
          list1.add(200);
          list1.add(300);
          list1.add(400);
          list1.add(500);
          System.out.println("List1 : "+list1);
          
          List<Integer> list2 = new ArrayList<>();
          list2.add(400);
          list2.add(500);
          list2.add(600);
          list2.add(700);
          list2.add(800);
          System.out.println("List2 : "+list2);
            
//          list1.addAll(list2);
//          System.out.println("addAll :  "+list1);
 
//          list1.removeAll(list2);
//          System.out.println("removeAll  : "+list1);

          list1.retainAll(list2);
          System.out.println("retainAll : "+list1);

       }
}
