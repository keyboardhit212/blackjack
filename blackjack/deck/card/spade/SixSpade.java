package blackjack.deck.card.spade;

import blackjack.deck.card.Card;
import blackjack.deck.card.Suite;

public class SixSpade extends Card {

    public SixSpade() {
        super(6, Suite.SPADE);
    }

    @Override
    public String toString() {
        return "\uD83C\uDCA6";
    }
}
