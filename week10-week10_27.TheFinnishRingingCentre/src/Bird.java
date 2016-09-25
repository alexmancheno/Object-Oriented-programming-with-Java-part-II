
public class Bird {

    private String name;
    private String latinName;
    private int ringingYear;

    public Bird(String name, String latinName, int ringingYear) {
        this.name = name;
        this.latinName = latinName;
        this.ringingYear = ringingYear;
    }


    @Override
    public String toString() {
        return this.latinName + " (" + this.ringingYear + ")";
    }
    
    
    public boolean equals(Object bird) {
        if (bird == null || bird.getClass() != getClass()) return false;
        Bird other = (Bird) bird;
        if (!latinName.equals(other.latinName) ||
            ringingYear != other.ringingYear) return false;
        return true;
    }
    
    public int hashCode() {
        if (latinName == null) return 7;
        return latinName.hashCode() + ringingYear;
    }
}