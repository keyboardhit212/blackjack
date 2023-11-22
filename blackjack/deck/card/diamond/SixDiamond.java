package blackjack.deck.card.diamond;

import blackjack.deck.card.Card;
import blackjack.deck.card.Suite;

public class SixDiamond extends Card {

    public SixDiamond() {
        super(6, Suite.DIAMOND);
    }

    @Override
    public String toString() {
        return "\uD83C\uDCC6";
    }
}
