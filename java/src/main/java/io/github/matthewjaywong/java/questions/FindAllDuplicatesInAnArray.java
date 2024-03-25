package io.github.matthewjaywong.java.questions;

import java.util.*;

/**
 * <h1>
 * <a href="https://leetcode.com/problems/find-all-duplicates-in-an-array/description/">442. Find All Duplicates in an Array</a>
 * </h1>
 * <h2>
 * Question of the Day: 25-03-2024
 * </h2>
 * <h3>
 * Medium
 * </h3>
 */
public class FindAllDuplicatesInAnArray {
    public List<Integer> solution(int[] nums) {
        List<Integer> res = new ArrayList<>();
        Set<Integer> seenSet = new HashSet<>();
        for (int num : nums) {
            if (seenSet.contains(num))
                res.add(num);

            seenSet.add(num);
        }

        return res;
    }
}
