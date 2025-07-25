// example showing the concept of generic class 
public class Demo8<DT1,DT2>{
        DT1 rno;
        DT2 name;
        Demo8(DT1 a, DT2 b){
            this.rno=a;
            this.name=b;
        }
        void display(){
            System.out.println("Roll Number : "+rno);
            System.out.println("Name : "+name);
        }
    public static void main(String[] args) {
        Demo8<Integer,String> obj = new Demo8<>(101,"Indore");
        obj.display();
    }
}