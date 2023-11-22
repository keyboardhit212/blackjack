package blackjack.deck.card.spade;

import blackjack.deck.card.Card;
import blackjack.deck.card.Suite;

public class TwoSpade extends Card {

    public TwoSpade() {
        super(1, Suite.SPADE);
    }

    @Override
    public String toString() {
        return 	"\uD83C\uDCA2";
    }
}
