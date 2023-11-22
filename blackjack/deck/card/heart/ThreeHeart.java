package blackjack.deck.card.heart;

import blackjack.deck.card.Card;
import blackjack.deck.card.Suite;

public class ThreeHeart extends Card {

    public ThreeHeart() {
        super(3, Suite.HEART);
    }

    @Override
    public String toString() {
        return "\uD83C\uDCB3";
    }
}
