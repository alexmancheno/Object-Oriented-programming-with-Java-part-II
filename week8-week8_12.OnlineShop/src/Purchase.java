
public class Purchase {

    private String product;
    private int amount;
    private int unitPrice;

    public Purchase(String product, int amount, int unitPrice) {
        this.product = product;
        this.amount = amount;
        this.unitPrice = unitPrice;
    }   
 
    public boolean equals(Purchase item) {
        if (!this.product.equals(item.product))
            return false;
        if(this.unitPrice != item.unitPrice)
            return false;
        return true;
    }
    
    public int price() {
        return amount * unitPrice;
    }

    public void increaseAmount() {
        amount++;
    }
    
    public String toString() {
        return product + ": " + amount;
    }

}

