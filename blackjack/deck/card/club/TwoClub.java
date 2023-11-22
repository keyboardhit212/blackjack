package blackjack.deck.card.club;

import blackjack.deck.card.Card;
import blackjack.deck.card.Suite;

public class TwoClub extends Card {

    public TwoClub() {
        super(2, Suite.CLUB);
    }

    @Override
    public String toString() {
        return 	"\uD83C\uDCD2";
    }
}
