package boxes;

public class Thing {

    private String name;
    private int weight;

    public Thing(String name, int weight) {
        if (weight < 0) 
            throw new IllegalArgumentException();
        this.name = name;
        this.weight = weight;
    }

    public Thing(String name) {
        this(name, 0);
    }

    public String getName() {
        return name;
    }

    public int getWeight() {
        return weight;
    }
    
    @Override
    public boolean equals(Object other) {
        if (this.getClass() != other.getClass() || other == null)
           return false;
        Thing compared = (Thing) other;
        return (this.name.equals(compared.name));
    }
    
    public int hashCode() {
       return name.hashCode();
    }
}
