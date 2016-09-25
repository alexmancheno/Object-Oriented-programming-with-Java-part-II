
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Hand implements Comparable<Hand> {

    private List<Card> hand = new ArrayList<Card>();

    public void add(Card card) {
        hand.add(card);
    }

    public void print() {
        for (Card card : hand) {
            System.out.println(card.toString());
        }
    }

    public void sort() {
        Collections.sort(hand);
    }

    public int handValue() {
        int handValue = 0;
        for (Card card : hand) {
            handValue += card.getValue();
        }
        return handValue;
    }

    @Override
    public int compareTo(Hand other) {
        return this.handValue() - other.handValue();
    }

    public void sortAgainstSuit() {
        SortAgainstSuitAndValue sort = new SortAgainstSuitAndValue();
        Collections.sort(hand, sort);
    }
}
