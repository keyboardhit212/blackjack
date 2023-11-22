package blackjack.deck.card.heart;

import blackjack.deck.card.Card;
import blackjack.deck.card.Suite;

public class SixHeart extends Card {

    public SixHeart() {
        super(6, Suite.HEART);
    }

    @Override
    public String toString() {
        return 	"\uD83C\uDCB6";
    }
}
