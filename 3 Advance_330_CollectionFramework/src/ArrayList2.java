
import java.util.ArrayList;

public class ArrayList2 {
    public static void main(String[] args) {
            ArrayList<Integer> list = new ArrayList<>();
            /*
            list.add(100);
            list.add(200);
            list.add(300);
            list.add(400);
            list.add(500);
            System.out.println("Elements : "+list);
            */
            
            System.out.println("size : "+list.size());
            list.add(Integer.valueOf("100"));
            
            list.add(new Integer(200));
            
            Integer i = new Integer(300);
            list.add(i);
            
            Integer j = 400;
            list.add(j);
            
            list.add(500);
            
            list.add(Integer.parseInt("600"));
            System.out.println("size : "+list.size());
            System.out.println("Elements : "+list);
            
    }
}
