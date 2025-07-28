// example showing the concept of wrapper class

public class WrapperDemo2 {
    public static void main(String[] args) {
    
//        Integer obj = Integer.valueOf(num);
        Integer obj = new Integer(123);
    
        System.out.println("object : "+obj);
        int num = obj.intValue();
        System.out.println("primitive datatype : "+num);
    }
}
