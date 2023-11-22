package blackjack.deck.card.spade;

import blackjack.deck.card.Card;
import blackjack.deck.card.Suite;

public class SevenSpade extends Card {

    public SevenSpade() {
        super(7, Suite.SPADE);
    }

    @Override
    public String toString() {
        return 	"\uD83C\uDCA7";
    }
}
