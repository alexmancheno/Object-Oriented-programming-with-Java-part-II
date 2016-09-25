
package application;

import java.util.Random;

public class Thermometer implements Sensor {
    private boolean isOn;
    private int measure;
    
    public Thermometer() {
        isOn = false;
    }
    
    public boolean isOn() {
        return isOn;
    }
    
    public void on() {
        isOn = true;
    }
    
    public void off() {
        isOn = false;
    }
    
    public int measure() {
        if (isOn) {
            Random rand = new Random();
            int randomNum = rand.nextInt(61) - 30;
            return randomNum;
        }
        else 
            throw new IllegalStateException("Sensor is off");
    }
    
}
