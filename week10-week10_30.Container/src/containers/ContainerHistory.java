
package containers;

import java.util.ArrayList;

public class ContainerHistory {

    private ArrayList<Double> history;
    
    public ContainerHistory() {
        history = new ArrayList<Double>();
    } 
    
    public void add(double situation) {
        history.add(situation);
    }
    
    public void reset() {
        history.clear();
    }
    
    @Override
    public String toString() {
        return history.toString();
    }
    
    public double maxValue() {
        if (history.isEmpty()) return 0;
        
        double max = 0;
        for (Double num : history)
            if (max < num) max = num;
        return max;
    }
    
    public double minValue() {
        if (history.isEmpty()) return 0;
        
        double min = history.get(0);
        for (Double num : history)
            if (min > num) min = num;
        return min;
    }
    
    public double average() {
        if (history.isEmpty()) return 0;
        
        double average = 0;
        for (Double num : history)
            average += num;
        return average / history.size();
    }
    
    public double greatestFluctuation() {
        if (history.size() < 2) return 0;
        double fluctuation = 0;
        for (int i = 0; i < history.size() - 1; i++) {
            if (Math.abs((history.get(i) - history.get(i + 1)) )> fluctuation)
                fluctuation = Math.abs(history.get(i) - history.get(i + 1));
        }
        return fluctuation;
    }
    
    public double variance() {
        if (history.size() < 2) return 0;
        double variance = 0;
        for (double d : history) {
            variance += Math.pow(d-this.average(), 2);
        }
        return variance/(history.size() - 1);
    }
}
