// example showing the concept of stack

import java.util.Stack;
public class ArrayList15 {
    public static void main(String[] args) {
        Stack<Double> stack = new Stack<>();
        System.out.println("stack : "+stack);
        stack.push(null);
        System.out.println("stack : "+stack);
        stack.push(200.56);
        System.out.println("stack : "+stack);
        stack.push(300.56);
        System.out.println("stack : "+stack);
        stack.push(400.56);
        System.out.println("stack : "+stack);
        stack.push(500.56);
        System.out.println("stack : "+stack);
        System.out.println("search : "+stack.search(300.56));
    }
}
