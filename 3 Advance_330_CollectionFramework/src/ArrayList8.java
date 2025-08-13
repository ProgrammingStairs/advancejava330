
import java.util.*;
class Student{
    int rno;
    double per;
    String name;

    public Student(int rno, double per, String name) {
        this.rno = rno;
        this.per = per;
        this.name = name;
    }
    @Override
    public String toString(){
        return "{"+rno+" , "+per+" ,  "+name+"}\n";
    }
    
}
public class ArrayList8 {
    public static void main(String[] args) {
            Student s1 = new Student(105, 56.67, "Peter Parker");
            Student s2 = new Student(101, 96.67, "Andrew Parker");
            Student s3 = new Student(110, 46.67, "Mathew Parker");
            
            ArrayList<Student> list = new ArrayList<>();
            list.add(s1);
            list.add(s2);
            list.add(s3);
            
        //    System.out.println("Elements : "+list);
            for(Student s : list){
                System.out.println(s);
            }
    }
}
