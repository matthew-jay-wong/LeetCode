package io.github.matthewjaywong.java.questions;

import io.github.matthewjaywong.java.common.TreeNode;

import java.util.Objects;

/**
 * <h1>
 *     <a href="https://leetcode.com/problems/search-in-a-binary-search-tree/description/">700. Search in a Binary Search Tree</a>
 * </h1>
 * <h2>
 *     LeetCode 75
 * </h2>
 * <h3>
 *     Easy
 * </h3>
 * <p>
 *     You are given the root of a binary search tree (BST) and an integer val.
 * </p>
 * <p>
 *     Find the node in the BST that the node's value equals val and return the subtree rooted with that node. If such a node does not exist, return null.
 * </p>
 */
public class SearchInABinarySearchTree {
    public TreeNode searchBST(TreeNode root, int val) {
        if (Objects.isNull(root))
            return null;

        if (root.val == val)
            return root;

        if (root.val < val)
            return searchBST(root.right, val);

        return searchBST(root.left, val);
    }
}
