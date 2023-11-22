package blackjack.cli;

import blackjack.deck.EmptyDeckException;
import blackjack.player.Player;

import java.util.Scanner;

public final class HitOrStand implements CLI {

    private Player computer;
    private Player me;

    public HitOrStand(Player computer, Player me) throws EmptyDeckException {
        this.computer = computer;
        this.me = me;
        execute();
    }

    @Override
    public void execute() {
        while (true) {
            new TableConceal(computer, me);
            if (!me.isBust() && !me.isBlackJack() && hit())
                ;
            else
                break;
        }
        try {
            computer.hit();
        } catch (EmptyDeckException e) {
            System.out.println("Can't hit! Deck is empty!");
        }
    }

    private boolean hit() {
        Scanner console = new Scanner(System.in);
        System.out.print("HIT? (y/n): ");
        char choice = console.next().charAt(0);
        if (choice == 'y' || choice == 'Y') {
            try {
                me.hit();
            } catch (EmptyDeckException e) {
                System.out.println("Can't hit! Deck is empty!");
            }
            System.out.println("\n\n");
            return true;
        } else {
            console.nextLine();
            return false;
        }
    }
}
