package blackjack.cli;

import blackjack.player.Player;

public final class TableConceal implements CLI {

    private Player computer;
    private Player me;

    public TableConceal(Player computer, Player me) {
        this.computer = computer;
        this.me = me;
        execute();
    }

    @Override
    public void execute() {
        ScreenUtils.clear();
        computer.showHandCard();
        System.out.println("\nCOMPUTER'S CARD\n");
        me.showHandCard();
        System.out.printf("\nYOUR CARD: %d\n\n", me.getSum());
    }
}
