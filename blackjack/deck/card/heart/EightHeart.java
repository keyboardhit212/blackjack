package blackjack.deck.card.heart;

import blackjack.deck.card.Card;
import blackjack.deck.card.Suite;

public class EightHeart extends Card {

    public EightHeart() {
        super(8, Suite.HEART);
    }

    @Override
    public String toString() {
        return 	"\uD83C\uDCB8";
    }
}
