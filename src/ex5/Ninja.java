package ex5;

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

    // Now override equals correctly!
    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj instanceof Ninja) {
            Ninja other = (Ninja) obj;
            return this.name.equals(other.name) && this.honor == other.honor;
        }
        return false;
    }
}
