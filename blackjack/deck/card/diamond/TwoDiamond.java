package blackjack.deck.card.diamond;

import blackjack.deck.card.Card;
import blackjack.deck.card.Suite;

public class TwoDiamond extends Card {

    public TwoDiamond() {
        super(2, Suite.DIAMOND);
    }

    @Override
    public String toString() {
        return 	"\uD83C\uDCC2";
    }
}
