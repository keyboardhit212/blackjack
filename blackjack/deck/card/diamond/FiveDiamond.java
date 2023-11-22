package blackjack.deck.card.diamond;

import blackjack.deck.card.Card;
import blackjack.deck.card.Suite;

public class FiveDiamond extends Card {

    public FiveDiamond() {
        super(5, Suite.DIAMOND);
    }

    @Override
    public String toString() {
        return 	"\uD83C\uDCC5";
    }
}
