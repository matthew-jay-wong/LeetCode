package io.github.matthewjaywong.java.questions;

import io.github.matthewjaywong.java.common.TreeNode;

import java.util.LinkedList;
import java.util.Objects;

/**
 * <a href="https://leetcode.com/problems/find-bottom-left-tree-value/">513. Find Bottom Left Tree Value</a>
 * Given the root of a binary tree, return the leftmost value in the last row of the tree.
 */
public class FindBottomLeftTreeValue {
    public int solution(TreeNode root) {
        LinkedList<TreeNode> stack = new LinkedList<>();
        stack.add(root);
        while (!stack.isEmpty()) {
            LinkedList<TreeNode> temp = new LinkedList<>();
            while (!stack.isEmpty()) {
                TreeNode cur = stack.pop();
                if (Objects.nonNull(cur.right))
                    temp.addLast(cur.right);
                if (Objects.nonNull(cur.left))
                    temp.addLast(cur.left);
                if (temp.isEmpty() && stack.isEmpty())
                    return cur.val;
            }
            stack = temp;
        }
        return 0;
    }
}
