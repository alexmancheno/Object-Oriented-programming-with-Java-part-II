
package moving.domain;

import java.util.ArrayList;

public class Box implements Thing {
    private ArrayList<Thing> list = new ArrayList<Thing>();
    private int maximumCapacity;
    
    public Box(int maximumCapacity) {
        this.maximumCapacity = maximumCapacity;
        this.list = new ArrayList<Thing>();
    }
    
    public int getVolume() {
        int volume = 0;
        for (Thing thing : list)
            volume += thing.getVolume();
        return volume;
    }
    
    public boolean addThing(Thing thing) {
        if (maximumCapacity - this.getVolume() >= thing.getVolume()) {
            list.add(thing);
            return true;
        }
        return false;
    }
}
