package ex1;

public class Ninja implements Comparable<Ninja> {

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
    public int compareTo(Ninja other) {
        return this.name.compareTo(other.name);
    }

    @Override
    public String toString() {
        return name + " " + honor;
    }
}
