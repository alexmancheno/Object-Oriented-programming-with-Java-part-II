
package farmsimulator;

public class BulkTank {
    
    private double capacity;
    private double volume;
    
    public BulkTank() {
        capacity = 2000;
        volume = 0;
    }
    
    public BulkTank(double capacity) {
        this.capacity = capacity;
        volume = 0;
    }
    
    public double getCapacity() {
        return capacity;
    }
    
    public double getVolume() {
        return volume;
    }
    
    public double howMuchFreeSpace() {
        return capacity - volume;
    }
    
    public void addToTank(double amount) {
        if (capacity - volume >= amount) volume += amount;
        else volume += this.howMuchFreeSpace();
    }
    
    public double getFromTank(double amount) {
        if (amount <= volume) {
            volume -= amount;
            return amount;
        } else {
            double temp = volume;
            volume = 0;
            return temp;
        }
    }
    
    public String toString() {
        return Math.ceil(volume) + "/" + Math.ceil(capacity);
    }
}
