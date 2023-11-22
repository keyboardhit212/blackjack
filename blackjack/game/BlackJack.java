package blackjack.game;

import blackjack.cli.GameResult;
import blackjack.cli.HitOrStand;
import blackjack.cli.TableReveal;
import blackjack.deck.BlackJackDeck;
import blackjack.deck.Deck;
import blackjack.deck.EmptyDeckException;
import blackjack.player.Computer;
import blackjack.player.Human;
import blackjack.player.Player;

public class BlackJack {

    public static void main(String[] args) {
        Deck deck = new BlackJackDeck();
        Player computer;
        Player me;

        try {
            computer = new Computer(deck);
            me = new Human(deck);
            new HitOrStand(computer, me);
            new TableReveal(computer, me);
            new GameResult(computer, me);
        } catch (EmptyDeckException e) {
            System.out.println("Deck is empty!");
            System.exit(0);
        }
    }
}
