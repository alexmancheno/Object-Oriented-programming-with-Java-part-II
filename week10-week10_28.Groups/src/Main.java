
import movable.Group;
import movable.Organism;

public class Main {

    public static void main(String[] args) {
    Group group = new Group();
    group.addToGroup(new Organism(73, 56));
    group.addToGroup(new Organism(57, 66));
    group.addToGroup(new Organism(46, 52));
    group.addToGroup(new Organism(19, 107));
    System.out.println(group);
    }
}
