
import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;

// example showing the concept of vector

public class ArrayList14 {
    public static void main(String[] args) {
        Vector<Character> vec = new Vector<>();
        vec.addElement('H');
        vec.add('E');
        vec.addElement('L');
        vec.add('L');
        vec.addElement('O');
        
        Enumeration e =  vec.elements();
        while(e.hasMoreElements()){
            System.out.print(e.nextElement());
        }
        System.out.println();
        Iterator itr = vec.iterator();
        while(itr.hasNext()){
            System.out.print(itr.next());
        }
    }
}
