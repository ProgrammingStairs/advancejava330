// example showing the concept of queue

import java.util.Collections;
import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Scanner;
public class ArrayList17 {
    public static void main(String[] args) {
        PriorityQueue<Integer> queue = new PriorityQueue<>();
        queue.add(100);
        queue.offer(200);
        queue.add(300);
        queue.offer(400);
        queue.add(500);
        
        System.out.println("Elements : "+queue);
        System.out.println("minimum element : "+Collections.min(queue));
        System.out.println("maximum element : "+Collections.max(queue));
        
        System.out.println("Elements are : ");
        Iterator itr =  queue.iterator();
        while(itr.hasNext()){
            System.out.print("\t"+itr.next());
        }
        
    }
}
