package blackjack.deck.card.diamond;

import blackjack.deck.card.Card;
import blackjack.deck.card.Suite;

public class SevenDiamond extends Card {

    public SevenDiamond() {
        super(7, Suite.DIAMOND);
    }

    @Override
    public String toString() {
        return 	"\uD83C\uDCC7";
    }
}
