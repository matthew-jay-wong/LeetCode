package io.github.matthewjaywong.java.questions;

import java.util.Arrays;

/**
 * <h1>
 *     <a href="https://leetcode.com/problems/count-elements-with-maximum-frequency/description/">3005. Count Elements With Maximum Frequency</a>
 * </h1>
 * <h2>Question of the Day: 08-03-2024</h2>
 * <h3>Easy</h3>
 * <p>
 *     You are given an array <code>nums</code> consisting of <b>positive</b> integers.
 * </p>
 * <p>
 *     Return the <b>total frequencies</b> of <i>elements</i> in <code>nums</code> such that those <i>elements</i> all have the <b>maximum</b> <i>frequency</i>.
 * </p>
 * <p>
 *    The <b>frequency</b> of an element is the number of occurrences of that element in the array.
 * </p>
 */
public class CountElementsWithMaximumFrequency {
    public int solution(int[] nums) {

        int maxFreq = 0;
        int members = 0;

        int[] freqMap = new int[101];
        Arrays.fill(freqMap, 0);
        for (int num : nums) {
            freqMap[num] += 1;
            if (freqMap[num] > maxFreq) {
                maxFreq = freqMap[num];
                members = 1;
            } else if (freqMap[num] == maxFreq) {
                members += 1;
            }
        }

        return members * maxFreq;
    }
}
