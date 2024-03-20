package io.github.matthewjaywong.java.questions;

/**
 * <h1>
 *     <a href="https://leetcode.com/problems/guess-number-higher-or-lower/description/">374. Guess Number Higher or Lower</a>
 * </h1>
 * <h2>
 *     LeetCode 75
 * </h2>
 * <h3>
 *     Easy
 * </h3>
 * <p>
 *     We are playing the Guess Game. The game is as follows:
 * </p>
 * <p>
 *     I pick a number from 1 to n. You have to guess which number I picked.
 * </p>
 * <p>
 *     Every time you guess wrong, I will tell you whether the number I picked is higher or lower than your guess.
 * </p>
 * <p>
 *     You call a pre-defined API int guess(int num), which returns three possible results:
 * </p>
 * <ul>
 *     <li>-1: Your guess is higher than the number I picked (i.e. num > pick).</li>
 *     <li>1: Your guess is lower than the number I picked (i.e. num < pick).</li>
 *     <li>0: your guess is equal to the number I picked (i.e. num == pick).</li>
 * </ul>
 */
public class GuessNumberHigherOrLower {
    private int guess(int num) {
        return -1;
    }

    public int solution(int n) {
        double lower = 1;
        double upper = n;
        double guess = Math.floor((double) n / 2);
        double res = this.guess((int) guess);
        while (res != 0) {
            if (res < 0) {
                upper = guess;
                guess -= (int) Math.floor((guess - lower) / 2);
            } else {
                lower = guess;
                guess += Math.floor((upper - guess) / 2);
            }

            res = this.guess((int) guess);
        }

        return (int) guess;
    }
}
