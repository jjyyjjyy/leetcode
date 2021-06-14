package io.github.jjyyjjyy.core;

/**
 * @author jy
 */
public class GuessGame {

    private final int pick;

    public GuessGame(int pick) {
        this.pick = pick;
    }

    public int guess(int n) {
        return Integer.compare(pick, n);
    }
}
