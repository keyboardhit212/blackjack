package blackjack.deck.card.heart;

import blackjack.deck.card.Card;
import blackjack.deck.card.Suite;

public class TwoHeart extends Card {

    public TwoHeart() {
        super(2, Suite.HEART);
    }

    @Override
    public String toString() {
        return 	"\uD83C\uDCB2";
    }
}
