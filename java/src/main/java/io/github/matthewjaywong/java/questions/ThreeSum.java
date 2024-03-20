package io.github.matthewjaywong.java.questions;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * <h1>
 * <a href="https://leetcode.com/problems/3sum/description/">15. 3Sum</a>
 * </h1>
 * <h2>
 * Top Interview 150
 * </h2>
 * <h3>
 * Medium
 * </h3>
 * <p>
 * Given an integer array nums, return all the triplets [nums[i], nums[j], nums[k]] such that i != j, i != k, and j != k, and nums[i] + nums[j] + nums[k] == 0.
 * </p>
 * <p>
 * Notice that the solution set must not contain duplicate triplets.
 * </p>
 */
public class ThreeSum {
    public List<List<Integer>> solution(int[] nums) {
        Map<Integer, List<Integer>> indexMap = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            Integer cur = nums[i];
            indexMap.putIfAbsent(cur, new ArrayList<>());
            int finalI = i;
            indexMap.computeIfPresent(cur, (k, v) -> {
                v.add(finalI);
                return v;
            });
        }

        Set<List<Integer>> res = new HashSet<>();
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                int target = -nums[i] - nums[j];
                if (indexMap.containsKey(target)) {
                    List<Integer> found = indexMap.get(target);
                    int finalI = i;
                    int finalJ = j;
                    Optional<Integer> foundIndex = found.stream().filter(n -> n != finalI && n != finalJ).findFirst();

                    if (foundIndex.isPresent())
                        res.add(Stream.of(nums[i], nums[j], nums[foundIndex.get()]).sorted().toList());
                }
            }
        }

        return res.stream().map(ArrayList::new).collect(Collectors.toList());
    }
}
