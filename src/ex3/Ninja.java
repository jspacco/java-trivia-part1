package ex3;

import java.util.Objects;

public class Ninja
{
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

    @Override
    public String toString() {
        return name + " " + honor;
    }

    // let's override hashCode but not equals and see what happens
    @Override
    public int hashCode()
    {
        return Objects.hash(name, honor);
    }
}
