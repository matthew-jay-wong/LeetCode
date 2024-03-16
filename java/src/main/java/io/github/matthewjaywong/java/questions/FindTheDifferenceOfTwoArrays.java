package io.github.matthewjaywong.java.questions;

import java.util.*;

/**
 * <h1>
 *     <a href="https://leetcode.com/problems/find-the-difference-of-two-arrays/description/">2215. Find the Difference of Two Arrays</a>
 * </h1>
 * <h2>
 *     LeetCode 75
 * </h2>
 * <h3>
 *     Easy
 * </h3>
 * <p>
 *     Given two 0-indexed integer arrays nums1 and nums2, return a list answer of size 2 where:
 * </p>
 * <ul>
 *     <li>answer[0] is a list of all distinct integers in nums1 which are not present in nums2.</li>
 *     <li>answer[1] is a list of all distinct integers in nums2 which are not present in nums1.</li>
 * </ul>
 * <p>
 *     Note that the integers in the lists may be returned in any order.
 * </p>
 */
public class FindTheDifferenceOfTwoArrays {
    public List<List<Integer>> solution(int[] nums1, int[] nums2) {
        Map<Integer, Boolean> nums1Seen = new HashMap<>();
        for (int num : nums1)
            nums1Seen.putIfAbsent(num, false);

        Set<Integer> uniqueToNums2 = new HashSet<>();
        for (int num : nums2) {
            if (!nums1Seen.containsKey(num))
                uniqueToNums2.add(num);
            nums1Seen.computeIfPresent(num, (key, val) -> true);
        }

        Set<Integer> uniqueToNums1 = new HashSet<>();
        for (Map.Entry<Integer, Boolean> entry : nums1Seen.entrySet()) {
            if (!entry.getValue())
                uniqueToNums1.add(entry.getKey());
        }

        return List.of(uniqueToNums1.stream().toList(), uniqueToNums2.stream().toList());
    }
}
