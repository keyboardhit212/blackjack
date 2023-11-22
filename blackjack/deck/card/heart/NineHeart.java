package blackjack.deck.card.heart;

import blackjack.deck.card.Card;
import blackjack.deck.card.Suite;

public class NineHeart extends Card {

    public NineHeart() {
        super(9, Suite.HEART);
    }

    @Override
    public String toString() {
        return 	"\uD83C\uDCB9";
    }
}
