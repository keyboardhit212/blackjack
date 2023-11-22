package blackjack.deck.card.club;

import blackjack.deck.card.Card;
import blackjack.deck.card.Suite;

public class TenClub extends Card {

    public TenClub() {
        super(10, Suite.CLUB);
    }

    @Override
    public String toString() {
        return 	"\uD83C\uDCDA";
    }
}
