
import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;
public class ArrayList5 {
    public static void main(String[] args) {
          ArrayList<Integer> list = new ArrayList<>();
          list.add(100);
          list.add(200);
          list.add(300);
          list.add(400);
          list.add(500);
          
          // method - I
//          System.out.println("Elements : "+list);
          
          // method - II  
//          Iterator<Integer> itr =  list.iterator();
//          System.out.println(""+itr.getClass().getName());
//          while(itr.hasNext()){
//              System.out.print(itr.next()+"\t");
//          }

        // method - III 
//          for(Iterator<Integer> itr =  list.iterator(); itr.hasNext() ; )
//                  System.out.print(itr.next()+"\t");

        // method-IV
//        for(Integer obj : list){
//            System.out.print(obj+"\t");
//        }

        // method-V
//        for(int value : list){
//            System.out.print(value+"\t");
//        }

            // method-VI
            ListIterator<Integer> listItr = list.listIterator();
            System.out.println("Forward direction : ");
            while(listItr.hasNext())
                System.out.print(listItr.next()+"\t");
            
            System.out.println("\nBackward direction : ");
            while(listItr.hasPrevious())
                System.out.print(listItr.previous()+"\t");
            
       }
}
