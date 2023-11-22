package blackjack.deck.card.heart;

import blackjack.deck.card.Card;
import blackjack.deck.card.Suite;

public class FourHeart extends Card {

    public FourHeart() {
        super(4, Suite.HEART);
    }

    @Override
    public String toString() {
        return "\uD83C\uDCB4";
    }
}
