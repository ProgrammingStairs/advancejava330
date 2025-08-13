// Example showing the concept of Bean class
import java.io.Serializable;
public class Demo4  implements Serializable{
    private int rno;
    private String name;
    private double per ;
    private String address;

    public Demo4() {
    }

    public int getRno() {
        return rno;
    }

    public void setRno(int rno) {
        this.rno = rno;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPer() {
        return per;
    }

    public void setPer(double per) {
        this.per = per;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
    
    public static void main(String[] args) {
        Demo4 obj = new Demo4();
        obj.setRno(100);
        obj.setName("Peter Parker");
        obj.setPer(45.56);
        obj.setAddress("Indore");
        
        System.out.println("Roll Number : "+obj.getRno());
        System.out.println("Name : "+obj.getName());
        System.out.println("Percentage : "+obj.getPer());
        System.out.println("Address : "+obj.getAddress());

    }
}
