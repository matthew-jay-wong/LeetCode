package io.github.matthewjaywong.java.questions;

import java.util.*;

/**
 * <h1>
 *     <a href="https://leetcode.com/problems/least-number-of-unique-integers-after-k-removals/">1481. Least Number of Unique Integers after K Removals</a>
 * </h1>
 * <h2>08-03-2024</h2>
 * <h3>Medium</h3>
 * <p>
 *     Given an array of integers arr and an integer k. Find the least number of unique integers after removing exactly k elements.
 * </p>
 */
public class LeastNumberOfUniqueIntegersAfterKRemovals {
    public int solution(int[] arr, int k) {
        Map<Integer, Integer> countMap = new HashMap<>();
        for (int num : arr)
            countMap.compute(num, (key, prevVal) -> Objects.isNull(prevVal) ? 1 : prevVal + 1);

        SortedMap<Integer, Integer> freqMap = new TreeMap<>();
        for (Map.Entry<Integer, Integer> entry : countMap.entrySet())
            freqMap.compute(entry.getValue(), (key, prevVal) -> Objects.isNull(prevVal) ? 1 : prevVal + 1);

        int remove = k;
        double removedCount = 0;
        for (Map.Entry<Integer, Integer> entry : freqMap.entrySet()) {
            if (remove < entry.getKey())
                break;
            if (remove < entry.getKey() * entry.getValue()) {
                removedCount += Math.floor((double) remove / entry.getKey());
                break;
            }

            remove -= entry.getKey() * entry.getValue();
            removedCount += entry.getValue();
        }

        return (int) (countMap.size() - removedCount);
    }
}
