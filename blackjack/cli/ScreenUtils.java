package blackjack.cli;

public final class ScreenUtils {

    private ScreenUtils() {}

    public static void clear() {
        System.out.println("\033\143");
    }
}
