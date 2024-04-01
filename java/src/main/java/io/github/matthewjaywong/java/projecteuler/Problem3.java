package io.github.matthewjaywong.java.projecteuler;

import java.util.*;

/**
 * <h1>
 *     <a href="https://projecteuler.net/problem=3">Problem 3: Largest Prime Factor</a>
 * </h1>
 * <h2>
 *     Difficulty: 5%
 * </h2>
 * <p>The prime factors of $13195$ are $5, 7, 13$ and $29$.</p>
 * <p>What is the largest prime factor of the number $600851475143$?</p>
 */
public class Problem3 {
    public static void main(String[] args) {
        Problem3 problem3 = new Problem3();
        System.out.println(problem3.solution(6_008_514_751_43L));
    }

    private static final SortedSet<Long> primesSorted = new TreeSet<>(Set.of(2L, 3L));

    public long solution(long num) {
        long cur = num;
        while (!primesSorted.contains(cur)) {
            boolean factorized = false;
            for (long prime : primesSorted) {
                if (cur % prime == 0) {
                    cur /= prime;
                    factorized = true;
                    break;
                }
            }

            if (factorized)
                continue;

            for (long potentialPrime = primesSorted.last() + 2; potentialPrime < Math.sqrt(cur); potentialPrime += 2) {
                long finalPotentialPrime = potentialPrime;
                if (primesSorted.stream().allMatch((p) -> finalPotentialPrime % p != 0)) {
                    primesSorted.add(potentialPrime);
                    if (cur % potentialPrime == 0) {
                        cur /= potentialPrime;
                        factorized = true;
                        break;
                    }
                }
            }

            if (factorized)
                continue;

            return cur;
        }

        return cur;
    }
}
