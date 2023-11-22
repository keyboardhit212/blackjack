package blackjack.deck.card.heart;

import blackjack.deck.card.Card;
import blackjack.deck.card.Suite;

public class TenHeart extends Card {

    public TenHeart() {
        super(10, Suite.HEART);
    }

    @Override
    public String toString() {
        return 	"\uD83C\uDCBA";
    }
}
