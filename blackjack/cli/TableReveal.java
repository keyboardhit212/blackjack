package blackjack.cli;

import blackjack.player.Player;

import javax.script.ScriptEngine;

public class TableReveal implements CLI {

    private Player computer;
    private Player me;

    public TableReveal(Player computer, Player me) {
        this.computer = computer;
        this.me = me;
        execute();
    }

    @Override
    public void execute() {
        ScreenUtils.clear();
        computer.showFullHandCard();
        System.out.printf("\nCOMPUTER'S CARD: %d\n\n", computer.getSum());
        me.showFullHandCard();
        System.out.printf("\nYOUR CARD: %d\n\n", me.getSum());
    }
}
