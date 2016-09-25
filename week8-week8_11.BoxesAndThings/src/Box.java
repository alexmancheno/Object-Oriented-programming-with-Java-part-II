import java.util.ArrayList;
 
 
public class Box implements ToBeStored{
    private double maxWeight;
    private ArrayList<ToBeStored> things;
     
    public Box (double maxWeight) {
        this.maxWeight = maxWeight;
        this.things = new ArrayList<ToBeStored>();
    }
     
    public void add(ToBeStored thing) {
        if (maxWeight - this.weight() >= thing.weight())
            things.add(thing);
    }
     
    public double weight() {
        double totalWeight = 0;
        for (ToBeStored thing : things)
            totalWeight += thing.weight();
        return totalWeight;
    }
     
    public String toString() {
        return "Box: " + things.size() + " things, total weight " + this.weight() + " kg";
    }
}
