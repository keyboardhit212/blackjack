package blackjack.deck.card.club;

import blackjack.deck.card.Card;
import blackjack.deck.card.Suite;

public class SevenClub extends Card {

    public SevenClub() {
        super(7, Suite.CLUB);
    }

    @Override
    public String toString() {
        return 	"\uD83C\uDCD7";
    }
}
