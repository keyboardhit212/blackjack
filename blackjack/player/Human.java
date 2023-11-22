package blackjack.player;

import blackjack.deck.Deck;
import blackjack.deck.EmptyDeckException;

public class Human extends Player {

    public Human(Deck deck) throws EmptyDeckException {
        super(deck);
    }
}
