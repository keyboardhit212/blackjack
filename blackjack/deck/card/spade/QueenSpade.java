package blackjack.deck.card.spade;

import blackjack.deck.card.Card;
import blackjack.deck.card.Suite;

public class QueenSpade extends Card {

    public QueenSpade() {
        super(10, Suite.SPADE);
    }


    @Override
    public String toString() {
        return "\uD83C\uDCAD";
    }
}
