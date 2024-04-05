package ex0;

public class Ninja
{
    // let's not include a toString() method and see what happens!
    private String name;
    private int honor;

    public Ninja(String name, int honor) {
        this.name = name;
        this.honor = honor;
    }

    public String getName() {
        return name;
    }

    public int getHonor() {
        return honor;
    }

    
}
