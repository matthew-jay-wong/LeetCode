package io.github.matthewjaywong.java.questions;

/**
 * <h1>
 * <a href="https://leetcode.com/problems/merge-sorted-array/description/">88. Merge Sorted Array</a>
 * </h1>
 * <h2>
 * Top Interview 150
 * </h2>
 * <h3>
 * Easy
 * </h3>
 * <ul>
 *     <li>Array</li>
 *     <li>Two Pointers</li>
 *     <li>Sorting</li>
 * </ul>
 * <p>
 *     You are given two integer arrays nums1 and nums2, sorted in non-decreasing order, and two integers m and n, representing the number of elements in nums1 and nums2 respectively.
 * </p>
 * <p>
 *     Merge nums1 and nums2 into a single array sorted in non-decreasing order.
 * </p>
 * <p>
 *     The final sorted array should not be returned by the function, but instead be stored inside the array nums1. To accommodate this, nums1 has a length of m + n, where the first m elements denote the elements that should be merged, and the last n elements are set to 0 and should be ignored. nums2 has a length of n.
 * </p>
 */
public class MergeSortedArray {
    public void solution(int[] nums1, int m, int[] nums2, int n) {
        int nums1Index = m - 1;
        int nums2Index = n - 1;
        int resIndex = m + n - 1;
        while (resIndex >= 0) {
            if (nums1Index >= 0 && nums2Index >= 0) {
                if (nums1[nums1Index] < nums2[nums2Index]) {
                    nums1[resIndex] = nums2[nums2Index];
                    nums2Index -= 1;
                } else {
                    nums1[resIndex] = nums1[nums1Index];
                    nums1Index -= 1;
                }
            } else if (nums1Index >= 0) {
                nums1[resIndex] = nums1[nums1Index];
                nums1Index -= 1;
            } else if (nums2Index >= 0) {
                nums1[resIndex] = nums2[nums2Index];
                nums2Index -= 1;
            }

            resIndex -= 1;
        }
    }
}
