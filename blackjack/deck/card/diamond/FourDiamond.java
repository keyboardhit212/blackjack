package blackjack.deck.card.diamond;

import blackjack.deck.card.Card;
import blackjack.deck.card.Suite;

public class FourDiamond extends Card {

    public FourDiamond() {
        super(4, Suite.DIAMOND);
    }

    @Override
    public String toString() {
        return "\uD83C\uDCC4";
    }
}
