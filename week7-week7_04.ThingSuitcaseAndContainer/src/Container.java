import java.util.ArrayList;
 
public class Container {
 
    private int maximumWeight;
    private ArrayList<Suitcase> suitcases = new ArrayList<Suitcase>();
 
    public Container(int maximumWeight) {
        this.maximumWeight = maximumWeight;
        suitcases = new ArrayList<Suitcase>();
    }
 
    public int totalWeight() {
        int totalWeight = 0;
        for (Suitcase suitcase : suitcases) {
            totalWeight += suitcase.totalWeight();
        }
        return totalWeight;
    }
 
    public void addSuitcase(Suitcase suitcase) {
        if (this.maximumWeight - this.totalWeight() >= suitcase.totalWeight()) {
            suitcases.add(suitcase);
        }
    }
 
    public void printThings() {
        for (Suitcase suitcase : suitcases)
            suitcase.printThings();
    }
 
    public String toString() {
        return suitcases.size() + " suitcases (" + this.totalWeight() + " kg)";
    }
 
}