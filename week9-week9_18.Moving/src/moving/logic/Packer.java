package moving.logic;

import java.util.ArrayList;
import java.util.List;
import moving.domain.Box;
import moving.domain.Thing;

public class Packer {

    private int maxVolume;
    private ArrayList<Box> boxes = new ArrayList<Box>();

    public Packer(int maxVolume) {
        this.maxVolume = maxVolume;
    }

    public List<Box> packThings(List<Thing> things) {
        ArrayList<Box> packer = new ArrayList<Box>();
        for (Thing thing : things) {
            Box box = new Box(maxVolume);
            while (box.addThing(thing)) {
                box.addThing(thing);
            }
            packer.add(box);
            box = new Box(maxVolume);
        }        
        return packer;
    }

    public String toString() {
        return "";
    }

}
