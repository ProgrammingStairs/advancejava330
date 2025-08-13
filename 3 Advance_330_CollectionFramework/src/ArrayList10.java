// Example showing the concept of Comparator
import java.util.*;
import java.util.Comparator;
class NewStudent{
    int rno;
    double per;
    String name;

    public NewStudent(int rno, double per, String name) {
        this.rno = rno;
        this.per = per;
        this.name = name;
    }
    @Override  // prints custom data of your object 
    public String toString(){ 
        return "{"+rno+" , "+per+" ,  "+name+"}\n";
    }
}
class SortByRollNumber implements Comparator<NewStudent>{
    @Override
    public int compare(NewStudent s1,NewStudent s2){
        return s1.rno-s2.rno;
    }
}
class SortByPercentage implements Comparator<NewStudent>{
    @Override
    public int compare(NewStudent s1,NewStudent s2){
        if(s1.per>s2.per)
                return 1;
        else if(s1.per<s2.per)
                return -1;
        else
                return 0;
    }
}
class SortByName implements Comparator<NewStudent>{
    @Override
    public int compare(NewStudent s1,NewStudent s2){
        return s1.name.compareTo(s2.name);
    }
}



public class ArrayList10 {
    public static void main(String[] args) {
            NewStudent s1 = new NewStudent(105, 56.67, "Peter Parker");
            NewStudent s2 = new NewStudent(101, 56.08, "Andrew Parker");
            NewStudent s3 = new NewStudent(110, 46.67, "Mathew Parker");
            
            ArrayList<NewStudent> list = new ArrayList<>();
            list.add(s1);
            list.add(s2);
            list.add(s3);
            
        //    System.out.println("Elements : "+list);
            for(NewStudent s : list){
                    System.out.println(s);
            }
            
            Collections.sort(list, new SortByRollNumber());
            System.out.println("Sorting based on roll number : ");
              System.out.println(list);
            
              Collections.sort(list,new SortByPercentage());
            System.out.println("Sorting based on percentage : ");      
              System.out.println(list);

              Collections.sort(list,new SortByName());
            System.out.println("Sorting based on name: ");      
              System.out.println(list);
    }
}
