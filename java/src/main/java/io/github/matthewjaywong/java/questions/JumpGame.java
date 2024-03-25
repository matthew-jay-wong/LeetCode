package io.github.matthewjaywong.java.questions;

import java.util.*;

/**
 * <h1>
 * <a href="https://leetcode.com/problems/jump-game/description/">55. Jump Game</a>
 * </h1>
 * <h2>
 * Top Interview 150
 * </h2>
 * <h3>
 * Medium
 * </h3>
 * <p>
 * You are given an integer array nums. You are initially positioned at the array's first index, and each element in the array represents your maximum jump length at that position.
 * </p>
 * <p>
 * Return true if you can reach the last index, or false otherwise.
 * </p>
 */
public class JumpGame {
//    public boolean solution(int[] nums) {
//        class Recurse {
//            private final AtomicIntegerArray mem;
//
//            public Recurse() {
////                int[] setup = new int[nums.length];
////                Arrays.fill(setup, -1);
////                this.mem = new AtomicIntegerArray(setup);
//            }
//
//            public boolean run(int target) {
//                if (target == 0)
//                    return true;
//
//                List<Integer> nextTargets = new ArrayList<>();
//                for (int i = target - 1; i >= 0; i--) {
//                    if (i + nums[i] >= target)
//                        nextTargets.add(i);
//                }
//
//                for (int nextTarget : nextTargets) {
//                    if (run(nextTarget))
//                        return true;
//                }
//
//                return false;
//            }
//        }
//
//
//        Recurse recurse = new Recurse();
//        return recurse.run(nums.length - 1);
//    }
}
