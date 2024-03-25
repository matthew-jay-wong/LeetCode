package io.github.matthewjaywong.java.questions;

import io.github.matthewjaywong.java.common.TreeNode;

import java.util.Objects;

/**
 * <h1>
 *     <a href="https://leetcode.com/problems/maximum-depth-of-binary-tree/description">104. Maximum Depth of Binary Tree</a>
 * </h1>
 * <h2>
 *     LeetCode 75
 * </h2>
 * <h3>
 *     Easy
 * </h3>
 * <p>
 *     Given the root of a binary tree, return its maximum depth.
 * </p>
 * <p>
 *     A binary tree's maximum depth is the number of nodes along the longest path from the root node down to the farthest leaf node.
 * </p>
 */
public class MaximumDepthOfBinaryTree {
//    public int maxDepth(TreeNode root) {
//        if (Objects.isNull(root))
//            return 0;
//
//        if (Objects.isNull(root.right()) && Objects.isNull(root.left()))
//            return 1;
//
//        if (Objects.isNull(root.right()))
//            return 1 + this.maxDepth(root.left());
//
//        if (Objects.isNull(root.left()))
//            return 1 + this.maxDepth(root.right());
//
//        return 1 + Math.max(this.maxDepth(root.right()), this.maxDepth(root.left()));
//    }
}
