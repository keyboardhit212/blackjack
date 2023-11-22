package blackjack.deck.card.spade;

import blackjack.deck.card.Card;
import blackjack.deck.card.Suite;

public class JackSpade extends Card {

    public JackSpade() {
        super(10, Suite.SPADE);
    }

    @Override
    public String toString() {
        return 	"\uD83C\uDCAB";
    }
}
