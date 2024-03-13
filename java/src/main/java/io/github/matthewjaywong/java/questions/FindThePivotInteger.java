package io.github.matthewjaywong.java.questions;

import java.util.HashMap;
import java.util.Map;

/**
 * <h1>
 * <a href="https://leetcode.com/problems/find-the-pivot-integer/">2485. Find the Pivot Integer</a>
 * </h1>
 * <h2>
 * Question of the Day: 13-03-2024
 * </h2>
 * <h3>
 * Easy
 * </h3>
 * <p>
 * Given a positive integer n, find the pivot integer x such that:
 * </p>
 * <ul>
 *     <li>The sum of all elements between 1 and x inclusively equals the sum of all elements between x and n inclusively.</li>
 * </ul>
 * <p>
 *     Return the pivot integer x. If no such integer exists, return -1. It is guaranteed that there will be at most one pivot index for the given input.
 * </p>
 */
public class FindThePivotInteger {
    public int solution(int n) {
        Map<Integer, Integer> factorialMap = new HashMap<>();
        for (int i = 0; i <= n; i++)
            factorialMap.put(i, i == 1  ? 1 : factorialMap.get(i - 1) + i);

        Integer nFactorial = factorialMap.get(n);
        for (int i = n - 1; i > 0; i--) {
            int iFactorial = factorialMap.get(i);
            if (nFactorial - iFactorial + i == nFactorial)
                return i;
        }

        return -1;
    }
}
