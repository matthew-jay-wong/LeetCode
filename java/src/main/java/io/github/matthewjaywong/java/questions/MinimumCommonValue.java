package io.github.matthewjaywong.java.questions;

import java.util.Arrays;
import java.util.List;
import java.util.TreeSet;

/**
 * <h1>
 * <a href="https://leetcode.com/problems/minimum-common-value/description/">2540. Minimum Common Value</a>
 * </h1>
 * <h2>Question of the Day: 09-03-2024</h2>
 * <h3>Medium</h3>
 * <p>
 * Given two integer arrays nums1 and nums2, sorted in non-decreasing order, return the minimum integer common to both arrays. If there is no common integer amongst nums1 and nums2, return -1.
 * </p>
 * <p>
 * Note that an integer is said to be common to nums1 and nums2 if both arrays have at least one occurrence of that integer.
 * </p>
 */
public class MinimumCommonValue {
    public int solution(int[] nums1, int[] nums2) {
        int j = 0;
        int k = 0;
        while (j < nums1.length && k < nums2.length) {
            while (j < nums1.length - 1 && nums1[j] == nums1[j + 1])
                j += 1;

            while (k < nums2.length - 1 && nums2[k] == nums2[k + 1])
                k += 1;

            if (nums1[j] == nums2[k])
                return nums1[j];

            if (nums1[j] < nums2[k])
                j += 1;
            else
                k += 1;
        }

        return -1;
    }
}
