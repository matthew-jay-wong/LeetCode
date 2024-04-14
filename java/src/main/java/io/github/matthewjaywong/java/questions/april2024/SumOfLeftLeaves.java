package io.github.matthewjaywong.java.questions.april2024;

import io.github.matthewjaywong.java.common.TreeNode;

import java.util.Objects;

/**
 * <h1>
 *     <a href="https://leetcode.com/problems/sum-of-left-leaves/description/">404. Sum of Left Leaves</a>
 * </h1>
 * <h2>
 *     14-04-2024
 * </h2>
 * <h3>
 *     Easy
 * </h3>
 * <p>
 *     Given the root of a binary tree, return the sum of all left leaves.
 * </p>
 * <p>
 *     A leaf is a node with no children. A left leaf is a leaf that is the left child of another node.
 * </p>
 */
public class SumOfLeftLeaves {
    public int solution(TreeNode root) {
        if (Objects.isNull(root))
            return 0;

        TreeNode left = root.left;
        TreeNode right = root.right;

        if (Objects.isNull(left) && Objects.isNull(right))
            return 0;

        if (Objects.isNull(left))
            return solution(right);

        if (Objects.isNull(left.left) && Objects.isNull(left.right))
            return left.val + solution(right);

        return solution(left) + solution(right);
    }
}
