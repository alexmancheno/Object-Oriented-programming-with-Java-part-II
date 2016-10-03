
package farmsimulator;

public class MilkingRobot {
    private BulkTank tank;
    
    public MilkingRobot() {
    }
    
    public BulkTank getBulkTank () {
        return tank;
    }
    
    public void setBulkTank(BulkTank tank) {
        this.tank = tank;
    }
    
    public void milk(Milkable milkable) {
        try {
        this.tank.addToTank(milkable.milk()); 
        } catch (Exception e) {
            throw new IllegalStateException();
        }
    }
    
    
}
