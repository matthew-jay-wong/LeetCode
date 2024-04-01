package io.github.matthewjaywong.java.projecteuler;

import java.util.stream.IntStream;
import java.util.stream.LongStream;

/**
 * <h1>
 * <a href="https://projecteuler.net/problem=5">Problem 5: Smallest Multiple</a>
 * </h1>
 * <h2>
 * Difficulty: 5%
 * </h2>
 * <p>$2520$ is the smallest number that can be divided by each of the numbers from $1$ to $10$ without any remainder.</p>
 * <p>What is the smallest positive number that is <strong class="tooltip">evenly divisible<span class="tooltiptext">divisible with no remainder</span></strong> by all of the numbers from $1$ to $20$?</p>
 */
public class Problem5 {
    public static void main(String[] args) {
        Problem5 problem5 = new Problem5();
        System.out.println(problem5.solution(1, 20));
    }
    public long solution(long lower, long upper) {
        long cur = upper;
        boolean found = false;
        while (!found) {
            cur += 1;
            long finalCur = cur;
            found = LongStream.rangeClosed(lower, upper).allMatch((n) -> finalCur % n == 0);
        }

        return cur;
    }
}
