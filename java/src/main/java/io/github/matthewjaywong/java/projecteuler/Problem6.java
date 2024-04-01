package io.github.matthewjaywong.java.projecteuler;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.function.LongUnaryOperator;
import java.util.stream.LongStream;

/**
 * <h1>
 * <a href="https://projecteuler.net/problem=6">Problem 6: Sum Square Difference</a>
 * </h1>
 * <h2>
 * Difficulty: 5%
 * </h2>
 * <p>The sum of the squares of the first ten natural numbers is,</p>
 * $$1^2 + 2^2 + ... + 10^2 = 385.$$
 * <p>The square of the sum of the first ten natural numbers is,</p>
 * $$(1 + 2 + ... + 10)^2 = 55^2 = 3025.$$
 * <p>Hence the difference between the sum of the squares of the first ten natural numbers and the square of the sum is $3025 - 385 = 2640$.</p>
 * <p>Find the difference between the sum of the squares of the first one hundred natural numbers and the square of the sum.</p>
 */
public class Problem6 {

    public static void main(String[] args) {
        Problem6 problem6 = new Problem6();
        System.out.println(problem6.solution(1, 100));
    }

    public BigInteger solution(long lower, long upper) {
        BigInteger sumOfSquares =
                LongStream.rangeClosed(lower, upper)
                        .mapToObj(BigInteger::valueOf)
                        .map((n) -> n.pow(2))
                        .reduce(BigInteger.ZERO, BigInteger::add);

        BigInteger squareOfSums =
                LongStream.rangeClosed(lower, upper)
                        .mapToObj(BigInteger::valueOf)
                        .reduce(BigInteger.ZERO, BigInteger::add)
                        .pow(2);

        return squareOfSums.subtract(sumOfSquares);
    }
}
