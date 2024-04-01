package io.github.matthewjaywong.java.projecteuler;

import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

/**
 * <h1>
 * <a href="https://projecteuler.net/problem=10">Problem 10: Summation of Primes</a>
 * </h1>
 * <h2>
 * Difficulty: 5%
 * </h2>
 * <p>The sum of the primes below $10$ is $2 + 3 + 5 + 7 = 17$.</p>
 * <p>Find the sum of all the primes below two million.</p>
 */
public class Problem10 {
    public static void main(String[] args) {
        Problem10 problem10 = new Problem10();
        System.out.println(problem10.solution(2_000_000));
    }

    private static final SortedSet<Long> sortedPrimes = new TreeSet<>(Set.of(2L, 3L));

    public long solution(int limit) {
        long nextPotentialPrime = sortedPrimes.last() + 2;
        while (sortedPrimes.last() < limit) {
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

        return sortedPrimes.stream().reduce(0L, Long::sum) - sortedPrimes.last();
    }
}
