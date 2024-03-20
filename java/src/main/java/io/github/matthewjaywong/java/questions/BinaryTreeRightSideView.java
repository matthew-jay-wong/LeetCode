package io.github.matthewjaywong.java.questions;

import io.github.matthewjaywong.java.common.TreeNode;

import java.util.*;

/**
 * <h1>
 *     <a href="https://leetcode.com/problems/binary-tree-right-side-view/">199. Binary Tree Right Side View</a>
 * </h1>
 * <h2>
 *     LeetCode 75
 * </h2>
 * <h3>
 *     Medium
 * </h3>
 * <p>
 *     Given the root of a binary tree, imagine yourself standing on the right side of it, return the values of the nodes you can see ordered from top to bottom.
 * </p>
 */
public class BinaryTreeRightSideView {
    public List<Integer> solution(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        Stack<TreeNode> stack = new Stack<>();
        if (Objects.nonNull(root))
            stack.push(root);

        while (!stack.isEmpty()) {
            TreeNode first = stack.peek();
            res.add(first.val);
            Stack<TreeNode> tempStack = new Stack<>();
            while (!stack.isEmpty())
                tempStack.add(stack.pop());

            while (!tempStack.isEmpty()) {
                TreeNode cur = tempStack.pop();
                if (Objects.nonNull(cur.left))
                    stack.push(cur.left);

                if (Objects.nonNull(cur.right))
                    stack.push(cur.right);
            }
        }

        return res;
    }
}
