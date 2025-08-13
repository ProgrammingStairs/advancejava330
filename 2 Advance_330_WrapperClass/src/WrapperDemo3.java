// example showing the concept of wrapper class

public class WrapperDemo3 {
    public static void main(String[] args) {
        // auto boxing
        int num = new Integer(1000);
        System.out.println("num : "+num);
        
        // unboxing
        Integer obj = num;
        System.out.println("object : "+obj);
    }
}
