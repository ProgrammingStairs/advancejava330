package MyClasses;
import java.util.Scanner;
class StudentNew{
    int sid;
    String name,email;

    public StudentNew(int sid, String name, String email) {
        this.sid = sid;
        this.name = name;
        this.email = email;
    }

    public StudentNew() {
    }

    public int getSid() {
        return sid;
    }

    public void setSid(int sid) {
        this.sid = sid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
    public void getDetails(){
            Scanner  sc = new Scanner(System.in);
            System.out.println("Enter Student id : ");
            sid = sc.nextInt();
            sc.nextLine();
            System.out.println("Enter Student name : ");
            name = sc.nextLine();
            System.out.println("Enter Student email : ");
            email = sc.nextLine();
    }
    
}
