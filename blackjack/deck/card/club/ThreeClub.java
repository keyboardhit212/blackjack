package blackjack.deck.card.club;

import blackjack.deck.card.Card;
import blackjack.deck.card.Suite;

public class ThreeClub extends Card {

    public ThreeClub() {
        super(3, Suite.CLUB);
    }

    @Override
    public String toString() {
        return 	"\uD83C\uDCD3";
    }
}
