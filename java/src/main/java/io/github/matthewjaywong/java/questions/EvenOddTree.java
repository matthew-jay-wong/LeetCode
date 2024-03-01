package io.github.matthewjaywong.java.questions;

import io.github.matthewjaywong.java.common.TreeNode;

import java.util.LinkedList;
import java.util.Objects;

/**
 * <a href="https://leetcode.com/problems/even-odd-tree">1609. Even Odd Tree</a>
 * A binary tree is named Even-Odd if it meets the following conditions:
 *      - The root of the binary tree is at level index 0, its children are at level index 1, their children are at level index 2, etc.
 *      - For every even-indexed level, all nodes at the level have odd integer values in strictly increasing order (from left to right).
 *      - For every odd-indexed level, all nodes at the level have even integer values in strictly decreasing order (from left to right).
 * Given the root of a binary tree, return true if the binary tree is Even-Odd, otherwise return false.
 */
public class EvenOddTree {
    public boolean solution(TreeNode root) {
//        LinkedList<TreeNode> stack = new LinkedList<>();
//        stack.add(root);
//        int row = 0;
//        while (!stack.isEmpty()) {
//            LinkedList<TreeNode> temp = new LinkedList<>();
//            while (!stack.isEmpty()) {
//                TreeNode cur = stack.pop();
//                if (Objects.nonNull(cur.right()))
//                    temp.addLast(cur.right());
//                if (Objects.nonNull(cur.left()))
//                    temp.addLast(cur.left());
//                if (temp.isEmpty() && stack.isEmpty())
//                    return cur.val();
//            }
//            row += 1;
//            if (row % 2 > 0) {
//                int cur = temp.
//                for (int i = 1; i < temp.size(); i++) {
//
//                }
//            }
//            stack = temp;
//        }
        return false;
    }
}
