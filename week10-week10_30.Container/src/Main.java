
import containers.ProductContainer;

public class Main {

    public static void main(String[] args) {
        ProductContainer juice = new ProductContainer("Juice", 1000.0);
        juice.addToTheContainer(1000.0);
        juice.takeFromTheContainer(11.3);
        System.out.println(juice.getName()); // Juice
        System.out.println(juice);

    }
}
