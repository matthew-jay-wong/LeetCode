package io.github.matthewjaywong.java.questions;

import io.github.matthewjaywong.java.common.TreeNode;

import java.util.Map;
import java.util.Objects;
import java.util.Stack;

/**
 * <h1>
 *     <a href="https://leetcode.com/problems/maximum-level-sum-of-a-binary-tree/description/">1161. Maximum Level Sum of a Binary Tree</a>
 * </h1>
 * <h2>
 *     LeetCode 75
 * </h2>
 * <h3>
 *     Medium
 * </h3>
 */
public class MaximumLevelSumOfABinaryTree {
    public int solution(TreeNode root) {
        Stack<TreeNode> stack = new Stack<>();
        stack.add(root);

        int curLevel = 1;
        Map.Entry<Integer, Integer> max = Map.entry(1, root.val);

        while (!stack.isEmpty()) {
            Stack<TreeNode> tempStack = new Stack<>();
            int sum = 0;
            while (!stack.isEmpty()) {
                TreeNode cur = stack.pop();
                sum += cur.val;

                if (Objects.nonNull(cur.left))
                    tempStack.add(cur.left);

                if (Objects.nonNull(cur.right))
                    tempStack.add(cur.right);
            }

            int maxSum = Math.max(max.getValue(), sum);
            if (maxSum > max.getValue())
                max = Map.entry(curLevel, maxSum);

            while (!tempStack.isEmpty())
                stack.add(tempStack.pop());

            curLevel += 1;
        }

        return max.getKey();
    }
}
