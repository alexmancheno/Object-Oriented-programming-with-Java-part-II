public class Main {
 
    public static void main(String[] Container) {
        Container container = new Container(1000);
        addSuitcasesFullOfBricks(container);
        System.out.println(container);
    }
 
    public static void addSuitcasesFullOfBricks(Container container) {
        int brickWeight = 1;
        while (brickWeight < 101) {
            Thing brick = new Thing("brick", brickWeight);
            Suitcase suitcase = new Suitcase(100);
            suitcase.addThing(brick);
            container.addSuitcase(suitcase);
            brickWeight++;
        }
    }
}
