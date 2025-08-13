// Example showing the concept of Comparable
import java.util.*;
import java.lang.Comparable;
class StudentNew implements Comparable<StudentNew>{
    int rno;
    double per;
    String name;

    public StudentNew(int rno, double per, String name) {
        this.rno = rno;
        this.per = per;
        this.name = name;
    }
    @Override  // prints custom data of your object 
    public String toString(){ 
        return "{"+rno+" , "+per+" ,  "+name+"}\n";
    }
//    @Override
//    public int compareTo(StudentNew s){
//          return rno-s.rno;
//    }

//    @Override
//    public int compareTo(StudentNew s){
//          if(per>s.per)
//                return 1;
//          else if(per<s.per)
//                return -1;
//          else 
//                return 0;
//    }
    
    @Override
    public int compareTo(StudentNew s){
          return name.compareTo(s.name);
    }

}
public class ArrayList9 {
    public static void main(String[] args) {
            StudentNew s1 = new StudentNew(105, 56.67, "Peter Parker");
            StudentNew s2 = new StudentNew(101, 56.08, "Andrew Parker");
            StudentNew s3 = new StudentNew(110, 46.67, "Mathew Parker");
            
            ArrayList<StudentNew> list = new ArrayList<>();
            list.add(s1);
            list.add(s2);
            list.add(s3);
            
        //    System.out.println("Elements : "+list);
            for(StudentNew s : list){
//                System.out.println(s);
                System.out.println(s.toString());
            }
            
            Collections.sort(list);
//            System.out.println("Sorting based on roll number : ");
//            System.out.println("Sorting based on percentage : ");      
              System.out.println("Sorting based on name: ");      
              System.out.println(list);
    }
}
