package moving.domain;

import moving.domain.Thing;

public class Item implements Thing, Comparable<Item> {

    private String name;
    private int volume;

    public Item(String name, int volume) {
        this.name = name;
        this.volume = volume;
    }

    public String getName() {
        return this.name;
    }

    @Override
    public int getVolume() {
        return this.volume;
    }

    @Override
    public String toString() {
        return name + " (" + volume + " dm^3)";
    }

    @Override
    public int compareTo(Item other) {
        return this.volume - other.volume;
    }
}
