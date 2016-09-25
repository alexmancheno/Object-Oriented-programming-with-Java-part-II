import java.util.HashMap;
import java.util.Map;
 
public class PromissoryNote {
        private HashMap<String, Double> debtOwed;
         
    public PromissoryNote() {
        debtOwed = new HashMap<String, Double>();
    }
     
    public void setLoan(String toWhom, double value) {
        debtOwed.put(toWhom, value);
    }
     
    public double howMuchIsTheDebt(String whose) {
        if (debtOwed.get(whose) == null) return 0;
        return debtOwed.get(whose);
    }
}
