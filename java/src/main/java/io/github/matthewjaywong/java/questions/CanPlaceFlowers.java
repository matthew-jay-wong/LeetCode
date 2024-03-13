package io.github.matthewjaywong.java.questions;

import java.util.Arrays;

/**
 * <h1>
 *     <a href="https://leetcode.com/problems/can-place-flowers/description/">605. Can Place Flowers</a>
 * </h1>
 * <h2>LeetCode 75</h2>
 * <h3>Easy</h3>
 * <p>
 *     You have a long flowerbed in which some of the plots are planted, and some are not. However, flowers cannot be planted in adjacent plots.
 * </p>
 * <p>
 *     Given an integer array flowerbed containing 0's and 1's, where 0 means empty and 1 means not empty, and an integer n, return true if n new flowers can be planted in the flowerbed without violating the no-adjacent-flowers rule and false otherwise.
 * </p>
 */
public class CanPlaceFlowers {
    public boolean solution(int[] flowerbed, int n) {
        int[] flowerbedCopy = Arrays.copyOf(flowerbed, flowerbed.length);
        for (int i = 0; i < flowerbedCopy.length; i++) {
            if (n == 0)
                return true;

            if (flowerbed[i] == 0) {
                boolean emptyLeft = i < 1 || flowerbedCopy[i - 1] == 0;
                boolean emptyRight = i == flowerbedCopy.length - 1 || flowerbedCopy[i + 1] == 0;
                if (emptyLeft && emptyRight) {
                    flowerbedCopy[i] = 1;
                    n -= 1;
                }
            }
        }

        return n == 0;
    }
}
