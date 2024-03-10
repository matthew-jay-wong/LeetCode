package io.github.matthewjaywong.java.questions;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * <h1>
 *     <a href="https://leetcode.com/problems/intersection-of-two-arrays/description/">349. Intersection of Two Arrays</a>
 * </h1>
 * <h2>Question of the Day: 10-03-2024</h2>
 * <h3>Easy</h3>
 * <p>
 *     Given two integer arrays nums1 and nums2, return an array of their intersection. Each element in the result must be unique and you may return the result in any order.
 * </p>
 */
public class IntersectionOfTwoArrays {
    public int[] solution(int[] nums1, int[] nums2) {
        Map<Integer, Boolean> seenMap = new HashMap<>();
        for (int num : nums1)
            seenMap.putIfAbsent(num, false);

        List<Integer> intersection = new ArrayList<>();
        for (int num : nums2) {
            if (!seenMap.containsKey(num) || seenMap.get(num))
                continue;
            intersection.add(num);
            seenMap.put(num, true);
        }

        int[] res = new int[intersection.size()];
        for (int i = 0; i < intersection.size(); i++)
            res[i] = intersection.get(i);

        return res;
    }
}
