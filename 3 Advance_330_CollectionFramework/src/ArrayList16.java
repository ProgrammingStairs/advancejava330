// example showing the concept of stack

import java.util.Scanner;
import java.util.Stack;
public class ArrayList16 {
    static void getData(Stack<Double> stack){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of elements : ");
        int num = sc.nextInt();
        System.out.println("Enter Elements : ");
        for(int i=1;i<=num;i++){
            System.out.println(stack);
            stack.push(sc.nextDouble());
        }
        System.out.println(stack);
        System.out.println("peek : "+stack.peek());
        System.out.println("---------Now Removing Elements-----------------");
        for(int i=0;i<num;i++){
            System.out.println("pop element : "+stack.pop());
            System.out.println(stack);
        }
    }
    public static void main(String[] args) {
        Stack<Double> stack = new Stack<>();
        getData(stack);
    }
}
