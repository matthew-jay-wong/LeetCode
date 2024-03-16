package io.github.matthewjaywong.java.questions;

import com.sun.source.tree.Tree;
import io.github.matthewjaywong.java.common.TreeNode;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Stack;

/**
 * <h1>
 *     <a href="https://leetcode.com/problems/leaf-similar-trees/">872. Leaf-Similar Trees</a>
 * </h1>
 * <h2>
 *     LeetCode 75
 * </h2>
 * <h3>
 *     Easy
 * </h3>
 * <p>
 *     Consider all the leaves of a binary tree, from left to right order, the values of those leaves form a leaf value sequence.
 * </p>
 * <img src="https://s3-lc-upload.s3.amazonaws.com/uploads/2018/07/16/tree.png">
 * <p>
 *     For example, in the given tree above, the leaf value sequence is (6, 7, 4, 9, 8).
 * </p>
 * <p>
 *     Two binary trees are considered leaf-similar if their leaf value sequence is the same.
 * </p>
 * <p>
 *     Return true if and only if the two given trees with head nodes root1 and root2 are leaf-similar.
 * </p>
 */
public class LeafSimilarTrees {

    public List<Integer> getLeafValueSequence(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        Stack<TreeNode> stack = new Stack<>();
        stack.push(root);
        while (!stack.isEmpty()) {
            TreeNode cur = stack.pop();
            if (Objects.isNull(cur.left) && Objects.isNull(cur.right))
                res.add(cur.val);

            if (Objects.nonNull(cur.right))
                stack.push(cur.right);

            if (Objects.nonNull(cur.left))
                stack.push(cur.left);
        }

        return res;
    }

    public boolean solution(TreeNode root1, TreeNode root2) {
        return this.getLeafValueSequence(root1).equals(this.getLeafValueSequence(root2));
    }
}
