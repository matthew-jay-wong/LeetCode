package io.github.matthewjaywong.java.projecteuler;

import java.util.HashSet;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

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

    private static final Set<Long> primesSorted = new HashSet<>();

    static {
        primesSorted.addAll(Set.of(2L, 3L, 5L, 7L, 11L, 13L));
    }

    public int solution(long num) {
        long cur = num;
        while (!primesSorted.contains(cur)) {
            boolean factored = false;
            for (long prime : primesSorted) {
                if (cur % prime == 0) {
                    cur /= prime;
                    factored = true;
                    break;
                }
            }

            // TODO
        }

        return -1;
    }
}
