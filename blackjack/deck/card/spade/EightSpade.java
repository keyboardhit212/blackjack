package blackjack.deck.card.spade;

import blackjack.deck.card.Card;
import blackjack.deck.card.Suite;

public class EightSpade extends Card {

    public EightSpade() {
        super(8, Suite.SPADE);
    }

    @Override
    public String toString() {
        return 	"\uD83C\uDCA8";
    }
}
