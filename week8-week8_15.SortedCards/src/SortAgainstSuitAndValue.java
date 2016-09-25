import java.util.Comparator;


public class SortAgainstSuitAndValue implements Comparator<Card>{
    @Override
    public int compare(Card one, Card two) {
        if (one.getSuit() == two.getSuit()) return one.getValue() - two.getValue();
        else return one.getSuit() - two.getSuit();
    }
   }
