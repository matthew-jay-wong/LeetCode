package io.github.matthewjaywong.java.projecteuler;

/**
 * <h1>
 * <a href="https://projecteuler.net/problem=1">Problem 1: Multiples of 3 or 5</a>
 * </h1>
 * <h2>
 *     Difficulty: 5%
 * </h2>
 * <p>If we list all the natural numbers below $10$ that are multiples of $3$ or $5$, we get $3, 5, 6$ and $9$. The sum of these multiples is $23$.</p>
 * <p>Find the sum of all the multiples of $3$ or $5$ below $1000$.</p>
 */
public class Problem1 {

    public static void main(String[] args) {
        Problem1 problem1 = new Problem1();
        System.out.println(problem1.solution(1000));
    }

    public int solution(int num) {
        int sum = 0;
        for (int i = 1; i < num; i++) {
            if (i % 3 == 0 || i % 5 == 0)
                sum += i;
        }

        return sum;
    }
}
