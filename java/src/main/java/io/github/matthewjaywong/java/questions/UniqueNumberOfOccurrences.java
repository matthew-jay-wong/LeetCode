package io.github.matthewjaywong.java.questions;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * <h1>
 *     <a href="https://leetcode.com/problems/unique-number-of-occurrences/description/">1207. Unique Number of Occurrences</a>
 * </h1>
 * <h2>
 *     LeetCode 75
 * </h2>
 * <h3>
 *     Easy
 * </h3>
 * <p>
 *     Given an array of integers arr, return true if the number of occurrences of each value in the array is unique or false otherwise.
 * </p>
 */
public class UniqueNumberOfOccurrences {
    public boolean solution(int[] arr) {
        Map<Integer, Integer> countMap = new HashMap<>();
        for (int num : arr) {
            countMap.putIfAbsent(num, 0);
            countMap.computeIfPresent(num, (key, val) -> val + 1);
        }

        return countMap.values().stream().distinct().count() == Arrays.stream(arr).distinct().count();
    }
}
