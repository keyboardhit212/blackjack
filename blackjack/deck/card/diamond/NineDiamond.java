package blackjack.deck.card.diamond;

import blackjack.deck.card.Card;
import blackjack.deck.card.Suite;

public class NineDiamond extends Card {

    public NineDiamond() {
        super(9, Suite.DIAMOND);
    }

    @Override
    public String toString() {
        return 	"\uD83C\uDCC9";
    }
}
