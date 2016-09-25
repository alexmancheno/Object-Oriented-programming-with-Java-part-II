
package application;

public class ConstantSensor implements Sensor {
    private final boolean isOn = true;
    private int measure;
    
    public ConstantSensor(int measure) {
        this.measure = measure;
    }
    
    public boolean isOn() {
        return isOn;
    }
    
    public void on() {
        
    }
    
    public void off() {
        
    }
    
    public int measure() {
        return measure;
    }
}
