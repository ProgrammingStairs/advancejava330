// example showing the concept of wrapper class

public class WrapperDemo7 {
    public static void main(String[] args) {
        int value1 = Integer.parseInt("1000");
        System.out.println("value1 : "+value1);
        
        double value2 = Double.parseDouble("1000");
        System.out.println("value2 : "+value2);
        
        float value3 = Float.parseFloat("1000");
        System.out.println("value3 : "+value3);
        
        boolean value4 = Boolean.parseBoolean("true");
        System.out.println("value4 : "+value4);

        boolean value5 = Boolean.parseBoolean("andrew");
        System.out.println("value5 : "+value5);

    }
}