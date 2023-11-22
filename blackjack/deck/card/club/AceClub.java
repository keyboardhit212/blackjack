package blackjack.deck.card.club;

import blackjack.deck.card.Card;
import blackjack.deck.card.Suite;

public class AceClub extends Card {

    public AceClub() {
        super(11, Suite.CLUB);
    }

    @Override
    public String toString() {
        return 	"\uD83C\uDCD1";
    }
}
