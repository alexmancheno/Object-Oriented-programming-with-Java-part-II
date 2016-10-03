
package boxes;

import java.util.ArrayList;

public class MaxWeightBox extends Box {
    private int maxWeight;
    private ArrayList<Thing> box;
    
    public MaxWeightBox(int maxWeight) {
        this.maxWeight = maxWeight;
        box = new ArrayList<Thing>();
    }
    
    public void add(Thing thing) {
        int currentWeight = 0;
        for (Thing item : box)
            currentWeight += item.getWeight();
        if (maxWeight - currentWeight >= thing.getWeight())
            box.add(thing);
    }
    
    public boolean isInTheBox(Thing thing) {
        return box.contains(thing);
    }
    
    
}
