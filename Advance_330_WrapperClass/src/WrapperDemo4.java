// example showing the concept of wrapper class

public class WrapperDemo4 {
    public static void main(String[] args) {
        Integer res1 = Integer.valueOf("100");
        System.out.println("valueOf(string) : "+res1);
        
        Integer res2 = Integer.valueOf(100);
        System.out.println("valueOf(int) : "+res2);
        
        Integer res3 = Integer.valueOf("10101", 3); // first argument will be binary
        System.out.println("valueOf(radix) : "+res3);  
    }
}
/*
     1 x 2^2 + 0 x 2^1 + 0 x 2^0
*/