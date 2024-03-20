package io.github.matthewjaywong.java.questions;

import java.util.*;
import java.util.stream.Collectors;

/**
 * <h1>
 * <a href="https://leetcode.com/problems/task-scheduler/description/">621. Task Scheduler</a>
 * </h1>
 * <h2>
 * Question of the Day: 19-03-2024
 * </h2>
 * <h3>
 * Medium
 * </h3>
 * <p>
 * You are given an array of CPU tasks, each represented by letters A to Z, and a cooling time, n. Each cycle or interval allows the completion of one task. Tasks can be completed in any order, but there's a constraint: identical tasks must be separated by at least n intervals due to cooling time.
 * </p>
 * <p>
 * Return the minimum number of intervals required to complete all tasks.
 * </p>
 */
public class TaskScheduler {
    public int solution(char[] tasks, int n) {
        int maxFreqTask = 0;
        int numMaxFreqTask = 0;

        Map<Character, Integer> taskCountMap = new HashMap<>();
        for (Character task : tasks) {
            taskCountMap.putIfAbsent(task, 0);
            taskCountMap.computeIfPresent(task, (k, v) -> v + 1);
            maxFreqTask = Math.max(taskCountMap.get(task), maxFreqTask);
        }

        for (Integer val : taskCountMap.values())
            if (val == maxFreqTask)
                numMaxFreqTask += 1;

        return Math.max((maxFreqTask - 1) * (n + 1) + numMaxFreqTask, tasks.length);
    }
}
