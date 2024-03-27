package io.github.matthewjaywong.java.questions;

import java.util.*;

/**
 * <h1>
 *     <a href="https://leetcode.com/problems/two-sum/description/">1. Two Sum</a>
 * </h1>
 * <h2>
 *     Top Interview 150
 * </h2>
 * <h3>
 *     Easy
 * </h3>
 * <p>
 *     Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
 * </p>
 * <p>
 *     You may assume that each input would have exactly one solution, and you may not use the same element twice.
 * </p>
 * <p>
 *     You can return the answer in any order.
 * </p>
 */
public class TwoSum {
    public int[] solution(int[] nums, int target) {
        Map<Integer, Set<Integer>> seen = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            seen.putIfAbsent(nums[i], new HashSet<>());
            seen.get(nums[i]).add(i);
        }

        for (int i = 0; i < nums.length; i++) {
            int t = target - nums[i];
            if (!seen.containsKey(t))
                continue;

            Set<Integer> indexes = seen.get(t);
            if (indexes.contains(i) && indexes.size() == 1)
                continue;

            int finalI = i;
            return new int[]{i, indexes.stream().filter(a -> a != finalI).findFirst().get()};
        }

        return new int[]{};
    }
}
