package blackjack.deck.card.diamond;

import blackjack.deck.card.Card;
import blackjack.deck.card.Suite;

public class EightDiamond extends Card {

    public EightDiamond() {
        super(8, Suite.DIAMOND);
    }

    @Override
    public String toString() {
        return "\uD83C\uDCC8";
    }
}
