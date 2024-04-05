package ex4;

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

    // OK, override hashCode correctly
    @Override
    public int hashCode()
    {
        return Objects.hash(name, honor);
    }

    // Why doesn't this compile?
    @Override
    public boolean equals(Ninja obj) {
        if (obj == null) {
            return false;
        }
        return this.name.equals(obj.name) && this.honor == obj.honor;
    }
}
