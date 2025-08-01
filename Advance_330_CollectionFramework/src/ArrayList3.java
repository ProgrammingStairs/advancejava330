
import java.util.ArrayList;

public class ArrayList3 {
    public static void main(String[] args) {
            ArrayList<Integer> list = new ArrayList<>(3); // 3 is initialcapacity
      
            System.out.println("isEmpty : "+list.isEmpty());
            list.add(100);
            list.add(200);
            list.add(300);
            list.add(400);
            list.add(500);
            
            System.out.println("Elements : "+list);
            System.out.println("Element at index 3 : "+list.get(3));
            
            list.remove(4);
            System.out.println("Elements : "+list);
            
            list.remove(new Integer(200));
            System.out.println("Elements : "+list);
            
            list.set(2, 1000);
            System.out.println("Elements : "+list);
            System.out.println("isEmpty : "+list.isEmpty());
            
            list.ensureCapacity(500);
    }
}
