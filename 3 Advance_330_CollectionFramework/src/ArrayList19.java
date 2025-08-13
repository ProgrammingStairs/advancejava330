// example showing the concept of queue

import java.util.*;
public class ArrayList19 {
    public static void main(String[] args) {
        ArrayDeque<Integer> queue = new ArrayDeque<>();
        queue.offerLast(400);
        queue.add(100);
        queue.offer(200);
        queue.offerFirst(300);
        queue.offer(500);
        queue.offer(600);
        queue.offer(700);
        queue.offer(800);
        queue.offer(900);
        
        System.out.println("Elements : "+queue);
        System.out.println("removeFirst : "+queue.removeFirst());
        System.out.println("Elements : "+queue);
        
        System.out.println("removeLast : "+queue.removeLast());
        System.out.println("Elements : "+queue);
        
        System.out.println("pollFirst : "+queue.pollFirst());
        System.out.println("Elements : "+queue);
        
        System.out.println("pollLast : "+queue.pollLast());
        System.out.println("Elements : "+queue);
    }
}
