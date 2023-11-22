package blackjack.deck.card.club;

import blackjack.deck.card.Card;
import blackjack.deck.card.Suite;

public class EightClub extends Card {

    public EightClub() {
        super(8, Suite.CLUB);
    }

    @Override
    public String toString() {
        return "\uD83C\uDCD8";
    }
}
