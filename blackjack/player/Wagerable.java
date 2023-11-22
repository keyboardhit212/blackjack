package blackjack.player;

public interface Wagerable {
    void setWager(int amount) throws InvalidWagerAmountException;
    int getWager();
    void payWager(Player player);
    void receiveWager(int amount);
}
