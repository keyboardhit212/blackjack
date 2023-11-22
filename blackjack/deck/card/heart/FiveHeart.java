package blackjack.deck.card.heart;

import blackjack.deck.card.Card;
import blackjack.deck.card.Suite;

public class FiveHeart extends Card {

    public FiveHeart() {
        super(5, Suite.HEART);
    }

    @Override
    public String toString() {
        return 	"\uD83C\uDCB5";
    }
}
