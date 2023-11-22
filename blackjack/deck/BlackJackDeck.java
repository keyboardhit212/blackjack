package blackjack.deck;

import blackjack.deck.card.Card;
import blackjack.deck.card.club.*;
import blackjack.deck.card.diamond.*;
import blackjack.deck.card.heart.*;
import blackjack.deck.card.spade.*;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BlackJackDeck extends Deck {

    private List<Card> deck;
    private final int LENGTH;
    private int position = 0;

    public BlackJackDeck() {
        this.deck = new ArrayList<>();
        addCardsToDeck();
        this.LENGTH = this.deck.size();
        shuffle();
    }

    @Override
    public Card draw() throws EmptyDeckException {
        if (position < LENGTH)
            return this.deck.get(position++);
        else
            throw new EmptyDeckException();
    }

    @Override
    public void shuffle() {
        Collections.shuffle(this.deck);
    }

    private void addCardsToDeck() {
        addClubCards();
        addDiamondCards();
        addHeartCards();
        addSpadeCards();
    }

    private void addClubCards() {
        this.deck.add(new AceClub());
        this.deck.add(new TwoClub());
        this.deck.add(new ThreeClub());
        this.deck.add(new FourClub());
        this.deck.add(new FiveClub());
        this.deck.add(new SixClub());
        this.deck.add(new SevenClub());
        this.deck.add(new EightClub());
        this.deck.add(new NineClub());
        this.deck.add(new TenClub());
        this.deck.add(new JackClub());
        this.deck.add(new QueenClub());
        this.deck.add(new KingClub());
    }

    private void addDiamondCards() {
        this.deck.add(new AceDiamond());
        this.deck.add(new TwoDiamond());
        this.deck.add(new ThreeDiamond());
        this.deck.add(new FourDiamond());
        this.deck.add(new FiveDiamond());
        this.deck.add(new SixDiamond());
        this.deck.add(new SevenDiamond());
        this.deck.add(new EightDiamond());
        this.deck.add(new NineDiamond());
        this.deck.add(new TenDiamond());
        this.deck.add(new JackDiamond());
        this.deck.add(new QueenDiamond());
        this.deck.add(new KingDiamond());
    }

    private void addHeartCards() {
        this.deck.add(new AceHeart());
        this.deck.add(new TwoHeart());
        this.deck.add(new ThreeHeart());
        this.deck.add(new FourHeart());
        this.deck.add(new FiveHeart());
        this.deck.add(new SixHeart());
        this.deck.add(new SevenHeart());
        this.deck.add(new EightHeart());
        this.deck.add(new NineHeart());
        this.deck.add(new TenHeart());
        this.deck.add(new JackHeart());
        this.deck.add(new QueenHeart());
        this.deck.add(new KingHeart());
    }

    private void addSpadeCards() {
        this.deck.add(new AceSpade());
        this.deck.add(new TwoSpade());
        this.deck.add(new ThreeSpade());
        this.deck.add(new FourSpade());
        this.deck.add(new FiveSpade());
        this.deck.add(new SixSpade());
        this.deck.add(new SevenSpade());
        this.deck.add(new EightSpade());
        this.deck.add(new NineSpade());
        this.deck.add(new TenSpade());
        this.deck.add(new JackSpade());
        this.deck.add(new QueenSpade());
        this.deck.add(new KingSpade());
    }


}
