package io.github.matthewjaywong.java.projecteuler;

/**
 * <h1>
 *     <a href="https://projecteuler.net/problem=9">Problem 9: Special Pythagorean Triplet</a>
 * </h1>
 * <h2>
 *     Difficulty: 5%
 * </h2>
 * <p>A Pythagorean triplet is a set of three natural numbers, $a \lt b \lt c$, for which,
 * $$a^2 + b^2 = c^2.$$</p>
 * <p>For example, $3^2 + 4^2 = 9 + 16 = 25 = 5^2$.</p>
 * <p>There exists exactly one Pythagorean triplet for which $a + b + c = 1000$.<br>Find the product $abc$.</p>
 */
public class Problem9 {
    public int solution(int target) {
        int a = 1;
        int b = 2;
        int c = 3;
        while (a + b + c != target || Math.pow(a, 2) + Math.pow(b, 2) != Math.pow(c, 2)) {

        }

        return -1; // TODO
    }
}
