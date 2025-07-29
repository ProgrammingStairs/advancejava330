// example showing the concept of wrapper class

public class WrapperDemo8 {
    public static void main(String[] args) {
//        String num1 = Integer.toString(120);
//        String num2 = Integer.toString(130);
        
        Integer n = new Integer(120);
        String num1 = n.toString();
        String num2 = new Integer(130).toString();

        System.out.println("String num1 : "+num1);
        System.out.println("String num2 : "+num2);
        
        System.out.println("Sum : "+(Integer.parseInt(num1)+Integer.parseInt(num2)));
        
        String b = new Boolean(true).toString();
        System.out.println("b : "+b);
        
        char a = 'x';
        String c = new Character(a).toString();
        System.out.println("c : "+c);
        /*
        Integer i1 = 123;
        Integer i2 = 130;
        Integer res = i1+i2;    // i1.intValue() + i2.intValue() -----> result.valueOf()
                                             //      unboxing ------------------------------> autoboxing   
        System.out.println("sum : "+res);
        */
    }
}