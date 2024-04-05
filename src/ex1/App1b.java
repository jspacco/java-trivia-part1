package ex1;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class App1b
{
    public static void main(String[] args)    
    {
        Set<Ninja> ninjas = new TreeSet<Ninja>(new Comparator<Ninja>() {
            @Override
            public int compare(Ninja n1, Ninja n2)
            {
                return n1.getHonor() - n2.getHonor();
            }
        });

        ninjas.add(new Ninja("Hanzo", 10));
        ninjas.add(new Ninja("Ryu", 20));

        // This will not be added to the set 
        ninjas.add(new Ninja("Hanzo", 30));
        
        System.out.println(ninjas.size());

        System.out.println(ninjas);
    }
}
