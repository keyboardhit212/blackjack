package blackjack.deck;

import blackjack.deck.card.Card;

public abstract class Deck {

    public abstract Card draw() throws EmptyDeckException;
    public abstract void shuffle();
}
