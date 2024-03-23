package io.github.matthewjaywong.java.questions;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * <h1>
 *     <a href="https://leetcode.com/problems/n-th-tribonacci-number/description/">1137. N-th Tribonacci Number</a>
 * </h1>
 * <h2>
 *     LeetCode 75
 * </h2>
 * <h3>
 *     Easy
 * </h3>
 */
public class NthTribonacciNumber {

    Map<Integer, Integer> mem = new ConcurrentHashMap<>();

    public int solution(int n) {
        if (n == 0)
            return 0;

        if (n == 1)
            return 1;

        if (n == 2)
            return 1;

        if (this.mem.containsKey(n))
            return this.mem.get(n);

        int prev = n - 3;
        this.mem.putIfAbsent(prev + 2, this.solution(prev + 2));
        this.mem.putIfAbsent(prev + 1, this.solution(prev + 1));
        this.mem.putIfAbsent(prev, this.solution(prev));
        return this.mem.get(prev + 2) + this.mem.get(prev + 1) + this.mem.get(prev);
    }
}
