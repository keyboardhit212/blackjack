package blackjack.deck.card.heart;

import blackjack.deck.card.Card;
import blackjack.deck.card.Suite;

public class AceHeart extends Card {

    public AceHeart() {
        super(11, Suite.HEART);
    }

    @Override
    public String toString() {
        return "\uD83C\uDCB1";
    }
}
