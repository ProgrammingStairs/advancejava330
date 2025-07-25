// Example showing the concept of getter and setter method

import java.util.Scanner;
class Student{
    private int rno;
    private String name;

    // getter methods
    public int getRno() {
        return rno;
    }

    public void setRno(int rno) {
        this.rno = rno;
    }
    
    // setter methods
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
public class Demo2 {
    public static void main(String[] args) {
        int rno;
        String name;
        Scanner sc = new Scanner(System.in);
        Student obj = new Student();
        
        System.out.println("Enter Roll Number : ");
        rno = sc.nextInt();
            sc.nextLine();
        System.out.println("Enter Name : ");
        name = sc.nextLine();
        
        // call setter method and pass argument in it
        obj.setRno(rno);
        obj.setName(name);
        
        // call getter method and print data of it
        System.out.println("Roll Number : "+obj.getRno());
        System.out.println("Name : "+obj.getName());
    }
}
