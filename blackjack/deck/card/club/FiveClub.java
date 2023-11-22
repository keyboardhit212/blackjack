package blackjack.deck.card.club;

import blackjack.deck.card.Card;
import blackjack.deck.card.Suite;

public class FiveClub extends Card {

    public FiveClub() {
        super(5, Suite.CLUB);
    }

    @Override
    public String toString() {
return "\uD83C\uDCD5";
    }
}
