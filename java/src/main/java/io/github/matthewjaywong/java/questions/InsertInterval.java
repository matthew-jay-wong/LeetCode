package io.github.matthewjaywong.java.questions;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * <h1>
 * <a href="https://leetcode.com/problems/insert-interval/description/">57. Insert Interval</a>
 * </h1>
 * <h2>
 * Question of the Day: 17-03-2024
 * </h2>
 * <h3>
 * Medium
 * </h3>
 * <p>
 * You are given an array of non-overlapping intervals intervals where intervals[i] = [starti, endi] represent the start and the end of the ith interval and intervals is sorted in ascending order by starti. You are also given an interval newInterval = [start, end] that represents the start and end of another interval.
 * </p>
 * <p>
 * Insert newInterval into intervals such that intervals is still sorted in ascending order by starti and intervals still does not have any overlapping intervals (merge overlapping intervals if necessary).
 * </p>
 * <p>
 * Return intervals after the insertion.
 * </p>
 * <p>
 * Note that you don't need to modify intervals in-place. You can make a new array and return it.
 * </p>
 */
public class InsertInterval {
    public int[][] solution(int[][] intervals, int[] newInterval) {
        if (intervals.length == 0)
            return new int[][]{newInterval};

        boolean intervalInserted = false;
        List<Map.Entry<Integer, Integer>> res = new ArrayList<>();
        for (int i = 0; i < intervals.length; i++) {
            int[] slow = intervals[i];

            if (slow[1] < newInterval[0] || intervalInserted) {
                res.add(Map.entry(slow[0], slow[1]));
                continue;
            }

            if (newInterval[1] < slow[0]) {
                res.add(Map.entry(newInterval[0], newInterval[1]));
                res.add(Map.entry(slow[0], slow[1]));
                intervalInserted = true;
                continue;
            }

            if (newInterval[0] < slow[0] && newInterval[1] == slow[1]) {
                res.add(Map.entry(newInterval[0], newInterval[1]));
                intervalInserted = true;
                continue;
            }

            if (i == intervals.length - 1 && newInterval[0] < slow[0] && newInterval[1] > slow[1]) {
                res.add(Map.entry(newInterval[0], newInterval[1]));
                intervalInserted = true;
                continue;
            }

            if (slow[0] <= newInterval[0] && newInterval[1] <= slow[1])
                return intervals;

            if (slow[0] <= newInterval[0]) {
                for (int j = i + 1; j < intervals.length; j++) {
                    int[] fast = intervals[j];
                    if (newInterval[1] < fast[0]) {
                        res.add(Map.entry(slow[0], newInterval[1]));
                        intervalInserted = true;
                        i = j - 1;
                        break;
                    }

                    if (fast[1] < newInterval[1])
                        continue;

                    if (fast[0] <= newInterval[1]) {
                        res.add(Map.entry(slow[0], fast[1]));
                        intervalInserted = true;
                        i = j - 1;
                        break;
                    }
                }


                if (intervalInserted)
                    continue;

                res.add(Map.entry(slow[0], newInterval[1]));
                intervalInserted = true;
                break;
            }

            if (newInterval[1] < slow[1]) {
                res.add(Map.entry(newInterval[0], slow[1]));
                intervalInserted = true;
            }
        }

        int[][] resArray;
        System.out.println(res);
        if (intervalInserted) {
            resArray = new int[res.size()][2];
            for (int i = 0; i < res.size(); i++)
                resArray[i] = new int[]{res.get(i).getKey(), res.get(i).getValue()};
        } else {
            resArray = new int[res.size() + 1][2];
            int i = 0;
            for (; i < intervals.length; i++)
                resArray[i] = intervals[i];
            resArray[i] = newInterval;
        }

        return resArray;
    }
}
