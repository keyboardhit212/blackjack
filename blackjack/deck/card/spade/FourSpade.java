package blackjack.deck.card.spade;

import blackjack.deck.card.Card;
import blackjack.deck.card.Suite;

public class FourSpade extends Card {

    public FourSpade() {
        super(4, Suite.SPADE);
    }

    @Override
    public String toString() {
        return "\uD83C\uDCA4";
    }
}
