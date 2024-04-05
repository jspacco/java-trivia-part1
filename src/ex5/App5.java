package ex5;

import java.util.HashSet;
import java.util.Set;

public class App5
{
    public static void main(String[] args) throws Exception
    {
        
        Ninja n1 = new Ninja("Hanzo", 10);
        Ninja n2 = new Ninja("Hanzo", 10);

        System.out.printf("n1 == n2? %b\n", n1 == n2);
        System.out.printf("n1.equals(n2)? %b\n", n1.equals(n2));

        System.out.printf("hashcode of n1 = %d\n", n1.hashCode());
        System.out.printf("hashcode of n2 = %d\n", n2.hashCode());

        Set<Ninja> set = new HashSet<>();
        set.add(n1);
        set.add(n2);

        System.out.printf("size of set: %d\n", set.size());

    }

}
