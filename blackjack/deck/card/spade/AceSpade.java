package blackjack.deck.card.spade;

import blackjack.deck.card.Card;
import blackjack.deck.card.Suite;

public class AceSpade extends Card {

    public AceSpade() {
        super(11, Suite.SPADE);
    }

    @Override
    public String toString() {
        return 	"\uD83C\uDCA1";
    }
}
