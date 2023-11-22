package blackjack.deck.card.spade;

import blackjack.deck.card.Card;
import blackjack.deck.card.Suite;

public class TenSpade extends Card {

    public TenSpade() {
        super(10, Suite.SPADE);
    }

    @Override
    public String toString() {
        return 	"\uD83C\uDCAA";
    }
}
