
package boxes;

import java.util.ArrayList;

public class BlackHoleBox extends Box {
    
    private ArrayList<Thing> box;
    
    public BlackHoleBox () {
        box = new ArrayList<Thing>();
    }
    
    public void add(Thing thing) {
        //box.add(thing);
        //box.remove(box);
    }
    
    public boolean isInTheBox(Thing thing) {
        return box.contains(thing);
    }
}
