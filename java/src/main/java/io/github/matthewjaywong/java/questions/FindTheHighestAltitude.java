package io.github.matthewjaywong.java.questions;

/**
 * <h1>
 *     <a href="https://leetcode.com/problems/find-the-highest-altitude/description/">1732. Find the Highest Altitude</a>
 * </h1>
 * <h2>
 *     LeetCode 75
 * </h2>
 * <h3>
 *     Easy
 * </h3>
 * <p>
 *     There is a biker going on a road trip. The road trip consists of n + 1 points at different altitudes. The biker starts his trip on point 0 with altitude equal 0.
 * </p>
 * <p>
 *     You are given an integer array gain of length n where gain[i] is the net gain in altitude between points i​​​​​​ and i + 1 for all (0 <= i < n). Return the highest altitude of a point.
 * </p>
 */
public class FindTheHighestAltitude {
    public int solution(int[] gain) {
        int max = 0;
        int sum = 0;
        for (int g : gain) {
            sum += g;
            max = Math.max(max, sum);
        }

        return max;
    }
}
