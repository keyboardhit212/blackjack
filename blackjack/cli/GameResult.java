package blackjack.cli;

import blackjack.player.Player;

public class GameResult implements CLI {

    private Player computer;
    private Player me;

    public GameResult(Player computer, Player me) {
        this.computer = computer;
        this.me = me;
        execute();
    }

    @Override
    public void execute() {
        if ((computer.isBlackJack() && me.isBlackJack()) || (me.isBust() && computer.isBust()))
            System.out.println("NO WINNER!");
        else if (computer.isBust() || (!me.isBust() && me.getSum() > computer.getSum()) || me.isBlackJack())
            System.out.println("YOU WON!");
        else if (me.isBust() || (!computer.isBust() && computer.getSum() > me.getSum()) || computer.isBlackJack())
            System.out.println("YOU LOST!");
        else
            System.out.println("NO WINNER!");
    }
}
