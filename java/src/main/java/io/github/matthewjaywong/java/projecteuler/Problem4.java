package io.github.matthewjaywong.java.projecteuler;

import java.util.Arrays;

/**
 * <h1>
 * <a href="https://projecteuler.net/problem=4">Problem 4: Largest Palindrome Product</a>
 * </h1>
 * <h2>
 * Difficulty: 5%
 * </h2>
 * <p>A palindromic number reads the same both ways. The largest palindrome made from the product of two $2$-digit numbers is $9009 = 91 \times 99$.</p>
 * <p>Find the largest palindrome made from the product of two $3$-digit numbers.</p>
 */
public class Problem4 {
    public static void main(String[] args) {
        Problem4 problem4 = new Problem4();
        System.out.println(problem4.solution(3));
    }

    public int solution(int numDigits) {
        int res = Integer.MIN_VALUE;
        String limitStr = String.format("1%s", "0".repeat(numDigits));
        int limit = Integer.parseInt(limitStr) - 1;
        for (int i = limit; i > 0; i--) {
            for (int j = limit; j > 0; j--) {
                String productStr = String.valueOf(i * j);
                if (productStr.contentEquals(new StringBuilder(productStr).reverse())) {
                    res = Math.max(res, i * j);
                }
            }
        }

        return res;
    }
}
