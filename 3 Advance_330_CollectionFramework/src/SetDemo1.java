// example showing the concept of Set

import java.util.*;
public class SetDemo1 {
    public static void main(String[] args) {
//        Set<Integer> set = new HashSet<>();
 //       Set<Integer> set = new LinkedHashSet<>();
        Set<Integer> set = new TreeSet<>();

        set.add(300);
        set.add(600);
        set.add(300);
        set.add(20);
        set.add(410);
        
        System.out.println("Elements : "+set);
    }
}
