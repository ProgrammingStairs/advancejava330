// example showing the concept of wrapper class

public class WrapperDemo5 {
    public static void main(String[] args) {
        Integer obj = new Integer(130);
        System.out.println("int : "+obj.intValue());
        System.out.println("float : "+obj.floatValue());
        System.out.println("long : "+obj.longValue());
        System.out.println("short : "+obj.shortValue());
        System.out.println("byte : "+obj.byteValue());
        System.out.println("double : "+obj.doubleValue());  
    }
}