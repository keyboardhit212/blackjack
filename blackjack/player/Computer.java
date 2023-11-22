package blackjack.player;

import blackjack.deck.Deck;
import blackjack.deck.EmptyDeckException;

public class Computer extends Player {

    public Computer(Deck deck) throws EmptyDeckException {
        super(deck);
    }

    @Override
    public void showHandCard() {
        System.out.printf("%s ?", this.handCard.getFirst());
    }

    @Override
    public void hit() throws EmptyDeckException {
        if (getSum() < 17)
            super.hit();
    }
}
