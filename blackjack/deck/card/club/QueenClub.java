package blackjack.deck.card.club;

import blackjack.deck.card.Card;
import blackjack.deck.card.Suite;

public class QueenClub extends Card {

    public QueenClub() {
        super(10, Suite.CLUB);
    }

    @Override
    public String toString() {
        return "\uD83C\uDCDD";
    }
}
