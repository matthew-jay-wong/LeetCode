package io.github.matthewjaywong.java.questions;

/**
 * <h1>
 *     <a href="https://leetcode.com/problems/container-with-most-water/description/">11. Container With Most Water</a>
 * </h1>
 * <h2>
 *     LeetCode 75
 * </h2>
 * <h3>
 *     Medium
 * </h3>
 * <p>
 *     You are given an integer array height of length n. There are n vertical lines drawn such that the two endpoints of the ith line are (i, 0) and (i, height[i]).
 * </p>
 * <p>
 *     Find two lines that together with the x-axis form a container, such that the container contains the most water.
 * </p>
 * <p>
 *     Return the maximum amount of water a container can store.
 * </p>
 * <p>
 *     Notice that you may not slant the container.
 * </p>
 */
public class ContainerWithMostWater {

    class MaxHeight {

        public int index;
        public int maxHeight;

        public MaxHeight(int index, int maxHeight) {
            this.index = index;
            this.maxHeight = maxHeight;
        }

        public MaxHeight(MaxHeight maxHeight) {
            this.maxHeight = maxHeight.maxHeight;
            this.index = maxHeight.index;
        }

        public String toString() {
            return String.format("index: %d, height: %d", this.index, this.maxHeight);
        }
    }

    public int solution(int[] height) {

//        MaxHeight[] maxHeights = new MaxHeight[height.length];
//        maxHeights[0] = new MaxHeight(0, 0);
//
//        for (int i = 1; i < height.length; i++) {
//            if (maxHeights[i - 1].maxHeight > height[i - 1])
//                maxHeights[i] = new MaxHeight(maxHeights[i - 1]);
//            else
//                maxHeights[i] = new MaxHeight(i - 1, height[i - 1]);
//
//            System.out.println(maxHeights[i]);
//        }
//
//        int maxVolume = Integer.MIN_VALUE;
//        for (int i = 1; i < maxHeights.length; i++) {
//            MaxHeight cur = maxHeights[i];
//            maxVolume = Math.max(maxVolume, (i - cur.index) * cur.maxHeight);
//        }
//
//        return maxVolume;

        return -1; // TODO
    }
}
