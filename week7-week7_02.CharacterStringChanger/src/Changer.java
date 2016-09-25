import java.util.ArrayList;
 
public class Changer {
 
    private int numberOfChanges = 0;
    private ArrayList<Change> changes;
 
    public Changer() {
        changes = new ArrayList<Change>();
    }
 
    public void addChange(Change change) {
        changes.add(change);
    }
 
    public String change(String characterString) {
        String newString = characterString;
        for (Change changer: changes) {
            newString = changer.change(newString);
        }
        return newString;
    }
 
}