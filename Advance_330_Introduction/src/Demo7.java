// example showing the concept of generic class and generic method
class MyClass{}
public class Demo7<DT>{
    <DT>void swap(DT a,DT b){
        DT temp = a;
        a = b;
        b = temp;
        System.out.println("\nAfter Swapping : \na : "+a+"\nb : "+b);
    }
    
    public static void main(String[] args) {
        Demo7<MyClass> obj = new Demo7<>();
        int a=5,b=6;
        System.out.println("Before Swapping : \na : "+a+"\nb : "+b);
        obj.swap(a,b);

        double a1=5.5,b1=6.23;
        System.out.println("Before Swapping : \na : "+a1+"\nb : "+b1);
        obj.swap(a1,b1);

        char a2='a' ,b2='b';
        System.out.println("Before Swapping : \na : "+a2+"\nb : "+b2);
        obj.swap(a2,b2);

    }
}