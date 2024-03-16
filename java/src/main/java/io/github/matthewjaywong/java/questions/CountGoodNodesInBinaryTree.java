package io.github.matthewjaywong.java.questions;

import io.github.matthewjaywong.java.common.TreeNode;

import java.util.Objects;

/**
 * <h1>
 *     <a href="https://leetcode.com/problems/count-good-nodes-in-binary-tree/description/">1448. Count Good Nodes in Binary Tree</a>
 * </h1>
 * <h2>
 *     LeetCode 75
 * </h2>
 * <h3>
 *     Medium
 * </h3>
 * <p>
 *     Given a binary tree root, a node X in the tree is named good if in the path from root to X there are no nodes with a value greater than X.
 * </p>
 * <p>
 *     Return the number of good nodes in the binary tree.
 * </p>
 */
public class CountGoodNodesInBinaryTree {

    public int recurse(TreeNode root, int max) {
        int isGood = root.val >= max ? 1 : 0;
        if (Objects.isNull(root.left) && Objects.isNull(root.right))
            return isGood;

        if (Objects.isNull(root.left))
            return isGood + this.recurse(root.right, Math.max(max, root.val));

        if (Objects.isNull(root.right))
            return isGood + this.recurse(root.left, Math.max(max, root.val));

        return isGood
                + this.recurse(root.right, Math.max(max, root.val))
                + this.recurse(root.left, Math.max(max, root.val));
    }

    public int solution(TreeNode root) {
        return this.recurse(root, Integer.MIN_VALUE);
    }
}
