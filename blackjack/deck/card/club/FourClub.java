package blackjack.deck.card.club;

import blackjack.deck.card.Card;
import blackjack.deck.card.Suite;

public class FourClub extends Card {

    public FourClub() {
        super(4, Suite.CLUB);
    }

    @Override
    public String toString() {
        return "\uD83C\uDCD4";
    }
}
