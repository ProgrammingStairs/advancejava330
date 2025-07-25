// Example

import java.util.Scanner;
public class Demo1 {
    private int rno;
    private String name;
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Demo1 obj = new Demo1();
        
        System.out.println("Enter Roll Number : ");
        obj.rno = sc.nextInt();
            sc.nextLine();
        System.out.println("Enter Name : ");
        obj.name = sc.nextLine();
        
        System.out.println("Roll Number : "+obj.rno);
        System.out.println("Name : "+obj.name);
    }
}
