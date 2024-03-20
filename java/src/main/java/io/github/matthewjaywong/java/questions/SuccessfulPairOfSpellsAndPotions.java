package io.github.matthewjaywong.java.questions;

import java.util.Arrays;

/**
 * <h1>
 *     <a href="https://leetcode.com/problems/successful-pairs-of-spells-and-potions/">2300. Successful Pairs of Spells and Potions</a>
 * </h1>
 * <h2>
 *     LeetCode 75
 * </h2>
 * <h3>
 *     Medium
 * </h3>
 * <p>
 *     You are given two positive integer arrays spells and potions, of length n and m respectively, where spells[i] represents the strength of the ith spell and potions[j] represents the strength of the jth potion.
 * </p>
 * <p>
 *     You are also given an integer success. A spell and potion pair is considered successful if the product of their strengths is at least success.
 * </p>
 * <p>
 *     Return an integer array pairs of length n where pairs[i] is the number of potions that will form a successful pair with the ith spell.
 * </p>
 */
public class SuccessfulPairOfSpellsAndPotions {
    public int[] solution(int[] spells, int[] potions, long success) {
        int[] res = new int[spells.length];
        Arrays.fill(res, 0);
        for (int i = 0; i < spells.length; i++) {
            for (int potion : potions) {
                if ((long) spells[i] * potion >= success)
                    res[i] += 1;
            }
        }

        return res;
    }
}
