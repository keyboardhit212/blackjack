package blackjack.deck.card.diamond;

import blackjack.deck.card.Card;
import blackjack.deck.card.Suite;

public class AceDiamond extends Card {

    public AceDiamond() {
        super(11, Suite.DIAMOND);
    }

    @Override
    public String toString() {
        return 	"\uD83C\uDCC1";
    }
}
