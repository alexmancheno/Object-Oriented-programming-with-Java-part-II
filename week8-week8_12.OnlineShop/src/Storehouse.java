
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Storehouse {

    private Map<String, Integer> prices = new HashMap<String, Integer>();
    private Map<String, Integer> stock = new HashMap<String, Integer>();

    public void addProduct(String product, int price, int quantity) {
        prices.put(product, price);
        stock.put(product, quantity);
    }

    public int price(String product) {
        for (String key: prices.keySet()) {
            if (key.equals(product))
                return prices.get(key);
        }
        return (-99);
    }
    
    public int stock(String product) {
        for (String key: stock.keySet())
            if (key.equals(product))
                return stock.get(key);
        return 0;
    }
    
    public boolean take(String product) {
        for (String key: stock.keySet()) {
            if (key.equals(product) && stock.get(product) > 0) {
                stock.put(product, stock.get(product) - 1);
                return true;
            }
        }
        return false;
    }
    
    public Set<String> products() {
        return stock.keySet();
    }
}