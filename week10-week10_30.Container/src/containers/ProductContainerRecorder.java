
package containers;

public class ProductContainerRecorder extends ProductContainer {
    
    private ContainerHistory history;
    
    public ProductContainerRecorder(String productName, double capacity, double initialVolume) {
        super(productName, capacity);
        history = new ContainerHistory();
        this.addToTheContainer(initialVolume);
    }
    
    public String history() {
        return history.toString();
    }
    
    @Override
    public void addToTheContainer(double amount) {
        super.addToTheContainer(amount);
        history.add(this.getVolume());
    }
    
    @Override
    public double takeFromTheContainer(double amount) {
        double prevVolume = this.getVolume();
        super.takeFromTheContainer(amount);
        history.add(this.getVolume());
        return prevVolume - this.getVolume();
    }
    
    public void printAnalysis() {
        System.out.println("Product: " + this.getName());
        System.out.println("History: " + this.history());
        System.out.println("Greatest product amount: " + history.maxValue());
        System.out.println("Smallest product amount: " + history.minValue());
        System.out.println("Average: " + history.average());
        System.out.println("Greatest change: " + history.greatestFluctuation());
        System.out.println("Variance: " + history.variance());
    }
}
