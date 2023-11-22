package blackjack.deck.card;

public abstract class Card {

    private int value;
    private Suite suite;

    protected Card(int value, Suite suite) {
        this.value = value;
        this.suite = suite;
    }

    public int getValue() {
        return this.value;
    }

    public Suite getSuite() {
        return this.suite;
    }


}
