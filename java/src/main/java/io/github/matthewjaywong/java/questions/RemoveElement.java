package io.github.matthewjaywong.java.questions;

/**
 * <h1>
 * <a href="https://leetcode.com/problems/remove-element/description/">27. Remove Element</a>
 * </h1>
 * <h2>
 * Top Interview 150
 * </h2>
 * <h3>
 * Easy
 * </h3>
 * <ul>
 *     <li>Arrays</li>
 *     <li>Two Pointers</li>
 * </ul>
 */
public class RemoveElement {
    public int solution(int[] nums, int val) {
        if (nums.length == 1) {
            if (nums[0] == val)
                return 0;
            return 1;
        }

        int slow = 0;
        int k = 0;
        for (int fast = 1; fast < nums.length; fast++) {
            if (nums[slow] == val) {
                if (nums[fast] != val) {
                    nums[slow] = nums[fast];
                    slow += 1;
                }

                fast += 1;
            } else {
                slow += 1;
                if (nums[fast] != val)
                    fast += 1;
                else
                    k += 1;
            }
        }

        return k;
    }
}
