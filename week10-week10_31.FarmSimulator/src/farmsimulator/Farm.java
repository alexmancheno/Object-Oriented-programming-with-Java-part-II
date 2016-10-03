
package farmsimulator;

import java.util.ArrayList;

public class Farm implements Alive{
    private String owner;
    private Barn barn;
    private ArrayList<Cow> cows;
    
    public Farm(String owner, Barn barn) {
        this.owner = owner;
        this.barn = barn;
        this.cows = new ArrayList<Cow>();
    }
    
    public String getOwner() {
        return owner;
    }
    
    public void addCow(Cow cow) {
        cows.add(cow);
    }
    
    @Override
    public void liveHour() {
        for (Cow cow : cows)
            cow.liveHour();
    }
    
    public void installMilkingRobot(MilkingRobot robot) {
        barn.installMilkingRobot(robot);
    }
    
    public void manageCows() {
        barn.takeCareOf(cows);
    }
    
    @Override
    public String toString() {
        String list = "Animals: " + "\n";
        if (!cows.isEmpty()) {
            for (Cow cow : cows)
                list += "\t" + cow.toString() + "\n";
        } else {
            String empty = "No cows.";
            list = empty;
        }
        return "Farm owner: " + owner +
               "\nBarn bulk tank: " + barn.toString() +
                "\n" + list;                    
    }
}
