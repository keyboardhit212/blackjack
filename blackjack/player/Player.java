package blackjack.player;

import blackjack.deck.Deck;
import blackjack.deck.EmptyDeckException;
import blackjack.deck.card.Card;
import blackjack.deck.card.club.AceClub;
import blackjack.deck.card.diamond.AceDiamond;
import blackjack.deck.card.heart.AceHeart;
import blackjack.deck.card.spade.AceSpade;

import java.util.ArrayList;
import java.util.List;

public class Player implements Wagerable {

    private Deck deck;
    protected List<Card> handCard;
    protected int wallet = 100;
    private int wager;

    protected Player(Deck deck) throws EmptyDeckException {
        this.deck = deck;
        this.handCard = new ArrayList<Card>();
        drawInitial();
    }

    public void drawInitial() throws EmptyDeckException {
        for (int i = 0; i < 2; i++)
            this.handCard.add(deck.draw());
    }

    public void draw() throws EmptyDeckException {
        this.handCard.add(deck.draw());
    }

    public void hit() throws EmptyDeckException {
        this.handCard.add(deck.draw());
    }

    public int getSum() {
        int sum = 0;
        for (Card card : handCard)
            sum += card.getValue();
        if (sum > 21 && hasAce())
            sum -= 10;
        return sum;
    }

    public void showFullHandCard() {
        for (Card card : handCard)
            System.out.printf("%s ", card);
    }

    public void showHandCard() {
        for (Card card : handCard)
            System.out.printf("%s ", card);
    }

    public boolean isBust() {
        if (getSum() > 21)
            return true;
        return false;
    }

    public boolean isBlackJack() {
        if (getSum() == 21)
            return true;
        return false;
    }

    private boolean hasAce() {
        for (Card card : handCard)
            if (card instanceof AceDiamond || card instanceof AceHeart ||
                    card instanceof AceClub || card instanceof AceSpade
            ) return true;
        return false;
    }

    @Override
    public void setWager(int amount) throws InvalidWagerAmountException {
        if (amount > wallet)
            throw new InvalidWagerAmountException();
        this.wallet -= amount;
        this.wager = amount;
    }

    @Override
    public int getWager() {
        return this.wager;
    }

    @Override
    public void payWager(Player player) {
        player.receiveWager(wager);
    }

    @Override
    public void receiveWager(int amount) {
        this.wallet += amount;
    }
}
