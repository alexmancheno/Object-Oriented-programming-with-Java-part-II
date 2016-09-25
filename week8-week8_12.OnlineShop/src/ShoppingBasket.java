
import java.util.ArrayList;
import java.util.List;

public class ShoppingBasket {

    private List<Purchase> list = new ArrayList<Purchase>();

    public ShoppingBasket() {
        list = new ArrayList<Purchase>();
    }

    public void add(String product, int price) {
        Purchase newItem = new Purchase(product, 1, price);
        for (Purchase item : list) {
            if (item.equals(newItem)) {
                    item.increaseAmount();
                    return;
            }
        }
        list.add(newItem);
    }

    public int price() {
        int total = 0;
        for (Purchase item : list) {
            total += item.price();
        }
        return total;
    }

    public void print() {
        for (Purchase item : list) {
            System.out.println(item.toString());
        }
    }
}
