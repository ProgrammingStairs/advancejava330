// example showing the concept of Set

import java.util.*;
public class SetDemo2 {
    public static void main(String[] args) {
        HashSet<String> fruitMarket = new HashSet<>();
        LinkedHashSet<String> fruitBuzz = new LinkedHashSet<>();
        TreeSet<String> fruitStore = new TreeSet<>();

        String ar[] = {"Mango","Banana","Apple"};
        for(String fruits : Arrays.asList(ar) ){
            fruitMarket.add(fruits);
            fruitBuzz.add(fruits);
            fruitStore.add(fruits);
        }
        
        System.out.println("HashSet(no insertion order) : "+fruitMarket);
        System.out.println("LinkedHashSet(insertion order) : "+fruitBuzz);
        System.out.println("TreeSet(Ascendingorder) : "+fruitStore);

    }
}
