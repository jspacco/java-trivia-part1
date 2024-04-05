package ex4;

public class App4 
{
    public static void main(String[] args)
    {
        
        Ninja ninja1 = new Ninja("Hanzo", 100);
        Object ninja2 = new Ninja("Hanzo", 100);
        
        // if you fix this error by removing the @Override
        // this is what happens... you get back false!
        System.out.println(ninja1.equals(ninja2));
    }
    
}
