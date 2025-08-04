
import java.util.ArrayList;
import java.util.Arrays;
public class ArrayList12 {
    public static void main(String[] args) {
          
            for(String name : Arrays.asList("red","green","blue")){
                System.out.print("\t"+name);
            }
            ArrayList<Integer> list = new ArrayList<>();
            int arr [] = {100,200,300,400};
            for(int element : arr){
                list.add(element);
            }
            System.out.println("Elements : "+list);
       }
}
