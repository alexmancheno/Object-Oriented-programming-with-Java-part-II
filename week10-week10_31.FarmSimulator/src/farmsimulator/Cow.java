package farmsimulator;

import java.util.Random;

public class Cow implements Milkable, Alive {

    private String name;
    private double udderCapacity;
    private double milkLeft;

    public Cow() {
        this.name = NAMES[new Random().nextInt(NAMES.length)];
        udderCapacity = 15.0 + new Random().nextInt(26);
        milkLeft = 0;
    }
    
    public Cow(String name) {
        this.name = name;
        udderCapacity = 15 + new Random().nextInt(26);
        milkLeft = 0;
    }
    
    public String getName() {
        return this.name;
    }
    
    public double getCapacity() {
        return this.udderCapacity;
    }
    
    public double getAmount() {
        return milkLeft;
    }
    
    public String toString() {
        return name + " " + Math.ceil(milkLeft) + "/" + Math.ceil(udderCapacity);
    }
    
    public double milk() {
        double milked = milkLeft;
        milkLeft = 0;
        return milked;      
    }
    
    public void liveHour() {
        double random = (7 + new Random().nextInt(14)) / 10.0;
        if (udderCapacity - milkLeft >= random) milkLeft += random;
        else milkLeft = udderCapacity;
    }

    private static final String[] NAMES = new String[]{
        "Anu", "Arpa", "Essi", "Heluna", "Hely",
        "Hento", "Hilke", "Hilsu", "Hymy", "Ihq", "Ilme", "Ilo",
        "Jaana", "Jami", "Jatta", "Laku", "Liekki",
        "Mainikki", "Mella", "Mimmi", "Naatti",
        "Nina", "Nyytti", "Papu", "Pullukka", "Pulu",
        "Rima", "Soma", "Sylkki", "Valpu", "Virpi"};
}
