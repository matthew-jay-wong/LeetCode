package io.github.matthewjaywong.java.projecteuler;

import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

/**
 * <h1>
 * <a href="https://projecteuler.net/problem=7">Problem 7: 10001st Prime</a>
 * </h1>
 * <h2>
 * Difficulty: 5%
 * </h2>
 * <p>By listing the first six prime numbers: $2, 3, 5, 7, 11$, and $13$, we can see that the $6$th prime is $13$.</p>
 * <p>What is the $10\,001$st prime number?</p>
 */
public class Problem7 {

    public static void main(String[] args) {
        Problem7 problem7 = new Problem7();
        System.out.println(problem7.solution(10_001));
    }

    private static final SortedSet<Long> sortedPrimes = new TreeSet<>(Set.of(2L, 3L));

    public long solution(int nth) {
        long nextPotentialPrime = sortedPrimes.last() + 2;
        while (sortedPrimes.size() < nth) {
            for (long prime : sortedPrimes) {
                if (prime > Math.sqrt(nextPotentialPrime)) {
                    sortedPrimes.add(nextPotentialPrime);
                    break;
                }

                if (nextPotentialPrime % prime == 0)
                    break;
            }

            nextPotentialPrime += 2;
        }

        return sortedPrimes.last();
    }
}
