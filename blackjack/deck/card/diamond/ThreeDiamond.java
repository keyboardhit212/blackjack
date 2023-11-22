package blackjack.deck.card.diamond;

import blackjack.deck.card.Card;
import blackjack.deck.card.Suite;

public class ThreeDiamond extends Card {

    public ThreeDiamond() {
        super(3, Suite.DIAMOND);
    }

    @Override
    public String toString() {
        return 	"\uD83C\uDCC3";
    }
}
