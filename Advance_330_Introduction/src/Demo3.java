// Example showing the concept of pojo class

public class Demo3 {
    int rno=101;
    protected String name="Andrew";
    private double per = 67.34;
    public String address = "Indore";

    public Demo3() {
    }
    
    protected void display(){
        System.out.println("Roll Number : "+rno);
        System.out.println("Name : "+name);
        System.out.println("Percentage : "+per);
        System.out.println("Address : "+address);
    }
    
    public static void main(String[] args) {
        Demo3 obj = new Demo3();
        obj.display();
    }
}
