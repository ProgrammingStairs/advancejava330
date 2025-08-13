// example showing the concept of wrapper class

public class WrapperDemo1 {
    public static void main(String[] args) {
        int num = 100; // primitive data type
        System.out.println("primitive value : "+num);
//        Integer obj = Integer.valueOf(num);
        Integer obj = new Integer(num);
        System.out.println("object : "+obj);
        System.out.println("obj instanceof Integer : "+(obj instanceof Integer));
        System.out.println("class name : "+obj.getClass());
        System.out.println("class name : "+obj.getClass().getName());
    }
}
