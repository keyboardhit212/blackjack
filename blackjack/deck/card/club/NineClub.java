package blackjack.deck.card.club;

import blackjack.deck.card.Card;
import blackjack.deck.card.Suite;

public class NineClub extends Card {

    public NineClub() {
        super(9, Suite.CLUB);
    }

    @Override
    public String toString() {
        return 	"\uD83C\uDCD9";
    }
}
