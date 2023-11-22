package blackjack.deck.card.spade;

import blackjack.deck.card.Card;
import blackjack.deck.card.Suite;

public class ThreeSpade extends Card {

    public ThreeSpade() {
        super(3, Suite.SPADE);
    }

    @Override
    public String toString() {
        return "\uD83C\uDCA3";
    }
}
