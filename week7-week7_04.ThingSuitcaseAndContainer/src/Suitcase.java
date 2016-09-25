import java.util.ArrayList;
 
public class Suitcase {
 
    private ArrayList<Thing> things = new ArrayList<Thing>();
    private int maximumWeight;
 
    public Suitcase(int maximumWeight) {
        this.maximumWeight = maximumWeight;
        this.things = new ArrayList<Thing>();
    }
 
    public void addThing(Thing thing) {
        if (this.maximumWeight - this.totalWeight() >= thing.getWeight()) {
            this.things.add(thing);
        }
    }
     
    public Thing heaviestThing() {
        if (things.isEmpty())
            return null;
        Thing heaviestThing = things.get(0);
        for (Thing thing : things ) {
            if (thing.getWeight() > heaviestThing.getWeight())
                heaviestThing = thing;
        }
        return heaviestThing;
    }
     
    public int totalWeight () {
        int totalWeight = 0;
        for (Thing thing : things)
            totalWeight += thing.getWeight();
        return totalWeight;
    }
 
    public void printThings() {
        for (Thing thing : things) {
            System.out.println(thing.toString());
        }
    }
 
    public String toString() {
        int numberOfThings = 0;
        for (Thing thing : things) {
            numberOfThings++;
        }
        if (numberOfThings == 0) {
            return "empty " + "(" + this.totalWeight() + " kg)";
        } else if (numberOfThings < 2) {
            return numberOfThings + " thing (" + this.totalWeight() + " kg)";
        } else {
            return numberOfThings + " things (" + this.totalWeight() + "kg)";
        }
    }
}