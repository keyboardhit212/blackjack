package blackjack.deck.card.diamond;

import blackjack.deck.card.Card;
import blackjack.deck.card.Suite;

public class TenDiamond extends Card {

    public TenDiamond() {
        super(10, Suite.DIAMOND);
    }

    @Override
    public String toString() {
        return "\uD83C\uDCCA";
    }
}
