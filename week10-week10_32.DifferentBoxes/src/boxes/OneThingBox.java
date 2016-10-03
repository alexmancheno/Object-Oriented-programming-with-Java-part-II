
package boxes;

import java.util.ArrayList;

public class OneThingBox extends Box {
    
    private ArrayList<Thing> box;
    
    public OneThingBox() {        
        box = new ArrayList<Thing>();
    }
    
    public void add(Thing thing) {
        if (box.isEmpty())
            box.add(thing);
    }
    
    public boolean isInTheBox(Thing thing) {
        return box.contains(thing);
    }
}
