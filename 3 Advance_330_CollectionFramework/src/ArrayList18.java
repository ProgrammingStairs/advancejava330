// example showing the concept of queue

import java.util.Collections;
import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Scanner;
public class ArrayList18 {
    public static void main(String[] args) {
        PriorityQueue<Integer> queue = new PriorityQueue<>();
//        queue.add(100); 
//        System.out.println("element : "+queue.element());

//        queue.add(100); 
//        System.out.println("peek : "+queue.peek());
   
//        queue.add(100); 
//        System.out.println("remove : "+queue.remove());
//        System.out.println("element : "+queue);

       // queue.add(100); 
        System.out.println("poll : "+queue.poll());
        System.out.println("element : "+queue);

    }
}
