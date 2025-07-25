// example showing the concept of generic class

public class Demo6<DT>{
    void swap(DT a,DT b){
        DT temp = a;
        a = b;
        b = temp;
        System.out.println("\nAfter Swapping : \na : "+a+"\nb : "+b);
    }
    
    public static void main(String[] args) {
        Demo6<Integer> obj1 = new Demo6<>();
        int a=5,b=6;
        System.out.println("Before Swapping : \na : "+a+"\nb : "+b);
        obj1.swap(a,b);

        Demo6<Double> obj2 = new Demo6<>();
        double a1=5.5,b1=6.23;
        System.out.println("Before Swapping : \na : "+a1+"\nb : "+b1);
        obj2.swap(a1,b1);

       Demo6<Character> obj3 = new Demo6<>();
        char a2='a' ,b2='b';
        System.out.println("Before Swapping : \na : "+a2+"\nb : "+b2);
        obj3.swap(a2,b2);

    }
}