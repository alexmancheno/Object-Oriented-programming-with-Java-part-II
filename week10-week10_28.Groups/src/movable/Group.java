package movable;

import java.util.ArrayList;

public class Group implements Movable {
    private ArrayList<Movable> group = new ArrayList<Movable>();        
    
    public void move(int dx, int dy) {
        for (Movable thing : group)
            thing.move(dx, dy);
    }
    
    public void addToGroup(Movable movable) {
        group.add(movable);
    }
    
    public String toString() {
        String groupToBeMoved = "";
        for (Movable thing : group)
            groupToBeMoved += thing.toString() + "\n";
        return groupToBeMoved;
    }    
}
