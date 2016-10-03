
package farmsimulator;

import java.util.Collection;

public class Barn {
    private BulkTank tank;
    private MilkingRobot robot;
    
    public Barn(BulkTank tank) {
        this.tank = tank;
    }
    
    public BulkTank getBulkTank() {
        return tank;
    }
    
    public void installMilkingRobot(MilkingRobot milkingRobot) {
        robot = milkingRobot;
        robot.setBulkTank(tank);
    }
    
    public void takeCareOf(Cow cow) {
        try {
            robot.milk(cow);
        } catch (Exception e) {
            throw new IllegalStateException();
        }
    }
    
    public void takeCareOf(Collection<Cow> cows) {        
        try {
            for (Cow cow: cows)
                robot.milk(cow);
        } catch (Exception e) {
            throw new IllegalStateException();
        }
    }
    
    public String toString() {
        return tank.toString();
    }
}
