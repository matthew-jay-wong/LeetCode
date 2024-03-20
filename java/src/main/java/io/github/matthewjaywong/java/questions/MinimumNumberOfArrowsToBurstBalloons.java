package io.github.matthewjaywong.java.questions;

import java.util.*;
import java.util.stream.Collectors;

/**
 * <h1>
 *     <a href="https://leetcode.com/problems/minimum-number-of-arrows-to-burst-balloons/">452. Minimum Number of Arrows to Burst Balloons</a>
 * </h1>
 * <h2>
 *     Question of the Day: 18-03-2024
 * </h2>
 * <h3>
 *     Medium
 * </h3>
 * <p>
 *     There are some spherical balloons taped onto a flat wall that represents the XY-plane. The balloons are represented as a 2D integer array points where points[i] = [xstart, xend] denotes a balloon whose horizontal diameter stretches between xstart and xend. You do not know the exact y-coordinates of the balloons.
 * </p>
 * <p>
 *     Arrows can be shot up directly vertically (in the positive y-direction) from different points along the x-axis. A balloon with xstart and xend is burst by an arrow shot at x if xstart <= x <= xend. There is no limit to the number of arrows that can be shot. A shot arrow keeps traveling up infinitely, bursting any balloons in its path.
 * </p>
 * <p>
 *     Given the array points, return the minimum number of arrows that must be shot to burst all balloons.
 * </p>
 */
public class MinimumNumberOfArrowsToBurstBalloons {
    public int solution(int[][] points) {
        TreeSet<int[]> treeSet = new TreeSet<>((interval1, interval2) -> {
            if (interval1[0] == interval2[1] && interval1[1] == interval2[0])
                return 0;

            if (interval1[0] == interval2[0]) {
                if (interval1[1] < interval2[1])
                    return -1;
                else
                    return 1;
            } else if (interval1[0] < interval2[0])
                return -1;
            else
                return 1;
        });

        treeSet.addAll(Arrays.asList(points));

        System.out.println(treeSet.stream().map(Arrays::toString).collect(Collectors.toList()));

        int res = 1;
        List<int[]> sortedEntryList = new ArrayList<>(treeSet);
        int[] prev = sortedEntryList.getFirst();
        for (int i = 1; i < sortedEntryList.size(); i++) {
            int[] cur = sortedEntryList.get(i);
            System.out.printf("prev %s cur %s\n", Arrays.toString(prev), Arrays.toString(cur));
            if (prev[1] < cur[0]) {
                res += 1;
                prev = cur;
                continue;
            }

            if (cur[1] < prev[1])
                prev = cur;
            else
                prev = new int[]{cur[0], prev[1]};
        }

        return res;
    }
}
