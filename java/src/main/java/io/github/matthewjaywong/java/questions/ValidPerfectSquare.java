package io.github.matthewjaywong.java.questions;

/**
 * <h1>
 *     <a href="https://leetcode.com/problems/valid-perfect-square/">367. Valid Perfect Square</a>
 * </h1>
 * <h2>
 *     Random
 * </h2>
 * <h3>
 *     Easy
 * </h3>
 * <p>
 *     Given a positive integer num, return true if num is a perfect square or false otherwise.
 * </p>
 * <p>
 *     A perfect square is an integer that is the square of an integer. In other words, it is the product of some integer with itself.
 * </p>
 * <p>
 *     You must not use any built-in library function, such as sqrt.
 * </p>
 */
public class ValidPerfectSquare {
    public boolean solution(int num) {
        if (num == 1)
            return true;

        for (int i = Math.floorDiv(num, 2); i > 1; i--) {
            if (i * i== num)
                return true;
        }

        return false;
    }
}
