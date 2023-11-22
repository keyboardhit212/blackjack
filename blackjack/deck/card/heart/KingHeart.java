package blackjack.deck.card.heart;

import blackjack.deck.card.Card;
import blackjack.deck.card.Suite;

public class KingHeart extends Card {

    public KingHeart() {
        super(10, Suite.HEART);
    }

    @Override
    public String toString() {
        return "\uD83C\uDCBE";
    }
}
