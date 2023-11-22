package blackjack.deck.card.club;

import blackjack.deck.card.Card;
import blackjack.deck.card.Suite;

public class SixClub extends Card {

    public SixClub() {
        super(6, Suite.CLUB);
    }

    @Override
    public String toString() {
        return "\uD83C\uDCD6";
    }
}
