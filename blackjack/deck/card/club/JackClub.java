package blackjack.deck.card.club;

import blackjack.deck.card.Card;
import blackjack.deck.card.Suite;

public class JackClub extends Card {

    public JackClub() {
        super(10, Suite.CLUB);
    }

    @Override
    public String toString() {
        return 	"\uD83C\uDCDB";
    }
}
