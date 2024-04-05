package ex1;

import java.util.Set;
import java.util.TreeSet;

public class App1 {
    public static void main(String[] args) throws Exception {
        
        Set<Ninja> ninjas = new TreeSet<>();

        ninjas.add(new Ninja("Hanzo", 10));
        ninjas.add(new Ninja("Ryu", 20));

        // This will not be added to the set 
        ninjas.add(new Ninja("Hanzo", 30));
        
        System.out.println(ninjas.size());

        System.out.println(ninjas);
    }
}
