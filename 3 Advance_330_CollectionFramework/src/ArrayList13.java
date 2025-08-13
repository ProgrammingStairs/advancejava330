// example showing the concept of LinkedList

import java.util.LinkedList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;

public class ArrayList13 {

    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
//        list.add(null);
        list.offerLast("Mark");
        list.add("Andrew");
        list.add("Andrew");
        list.add("Peter");
        list.add("Mathew");
        list.add("Jack");
        list.offerFirst("Simon");

        System.out.println("List : " + list);
        Collections.sort(list);
        System.out.println("Collections.sort() : " + list);

        Iterator itr = list.iterator();
//         System.out.println(itr);
        while (itr.hasNext()) {
            System.out.print("\t" + itr.next());
        }
    }
}
