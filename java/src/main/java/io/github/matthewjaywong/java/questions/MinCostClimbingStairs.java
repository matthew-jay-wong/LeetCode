package io.github.matthewjaywong.java.questions;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * <h1>
 * <a href="https://leetcode.com/problems/min-cost-climbing-stairs/description/">746. Min Cost Climbing Stairs</a>
 * </h1>
 * <h2>
 * LeetCode 75
 * </h2>
 * <h3>
 * Easy
 * </h3>
 */
public class MinCostClimbingStairs {

    public int solution(int[] cost) {
        class Recurse {
            private final Map<Integer, Integer> mem;
            private final int[] cost;

            public Recurse(int[] cost) {
                this.mem = new ConcurrentHashMap<>();
                this.cost = cost;
            }

            public int recurse(int cur) {
                if (cur >= cost.length)
                    return 0;

                if (this.mem.containsKey(cur))
                    return this.mem.get(cur);

                this.mem.putIfAbsent(cur + 1, this.recurse(cur + 1));
                this.mem.putIfAbsent(cur + 2, this.recurse(cur + 2));

                return cost[cur] + Math.min(this.mem.get(cur + 1), this.mem.get(cur + 2));
            }
        }

        Recurse recurse = new Recurse(cost);

        return Math.min(recurse.recurse(0), recurse.recurse(1));
    }
}
