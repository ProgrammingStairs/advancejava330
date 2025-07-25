// example without the concept of generic class

public class Demo5{
    void swap(int a,int b){
        int temp = a;
        a = b;
        b = temp;
        System.out.println("\nAfter Swapping : \na : "+a+"\nb : "+b);
    }
    
    void swap(double a,double b){
        double temp = a;
        a = b;
        b = temp;
        System.out.println("\nAfter Swapping : \na : "+a+"\nb : "+b);
    }

    void swap(char a,char b){
        char temp = a;
        a = b;
        b = temp;
        System.out.println("\nAfter Swapping : \na : "+a+"\nb : "+b);
    }
    
    public static void main(String[] args) {
        Demo5 obj1 = new Demo5();
    
        int a=5,b=6;
        System.out.println("Before Swapping : \na : "+a+"\nb : "+b);
        obj1.swap(a,b);

        double a1=5.5,b1=6.23;
        System.out.println("Before Swapping : \na : "+a1+"\nb : "+b1);
        obj1.swap(a1,b1);

        char a2='a' ,b2='b';
        System.out.println("Before Swapping : \na : "+a2+"\nb : "+b2);
        obj1.swap(a2,b2);

    }
}