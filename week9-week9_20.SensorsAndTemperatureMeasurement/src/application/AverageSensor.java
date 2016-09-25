
package application;

import java.util.ArrayList;
import java.util.List;

public class AverageSensor implements Sensor {
    private List<Sensor> sensorList = new ArrayList<Sensor>();
    private List<Integer> readingsList = new ArrayList<Integer>();
    
    public AverageSensor() {
        sensorList = new ArrayList<Sensor>();
    }
     
    public void addSensor(Sensor additional) {
        sensorList.add(additional);
    }
    
    public void on() {
        for (Sensor sensor : sensorList)
            sensor.on();
    }
    
    public void off() {
        for (Sensor sensor : sensorList)
            sensor.off();
    }
    
    public boolean isOn() {
        for (Sensor sensor : sensorList)
            if (!sensor.isOn()) 
                return false;
        return true;
    }
    
    public int measure() {
        if (!this.isOn() || sensorList.isEmpty())
            throw new IllegalStateException("Average sensor is off");

        int onSensors = 0;
        for (Sensor sensor : sensorList)
            onSensors += sensor.measure();
        onSensors /= sensorList.size();
        readingsList.add(onSensors);
        return onSensors;
        
    }
    
    public List<Integer> readings() {
        return readingsList;
    }
    
}
