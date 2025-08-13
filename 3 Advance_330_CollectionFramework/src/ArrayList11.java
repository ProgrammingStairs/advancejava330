
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
public class ArrayList11 {
    public static void main(String[] args) {
            ArrayList<Integer> list = new ArrayList<>();
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter size : ");
            int size = sc.nextInt();
            System.out.println("Enter Elements : ");
            for(int i=1;i<=size;i++){
                list.add(sc.nextInt());
            }
            
            System.out.println("Elements are : "+list);
            
            int arr[] = new int[list.size()];
            for(int i=0;i<list.size();i++){
                arr[i] = list.get(i);
            }
           
            System.out.println("\nArray elements are : ");
            for(int element : arr)
                System.out.print(element+"\t");
            
    }
}
