package io.github.matthewjaywong.java.questions;

import io.github.matthewjaywong.java.common.ListNode;

import java.util.List;
import java.util.Objects;

/**
 * <h1>
 *     <a href="https://leetcode.com/problems/maximum-twin-sum-of-a-linked-list/description/">2130. Maximum Twin Sum of a Linked List</a>
 * </h1>
 * <h2>
 *     LeetCode 75
 * </h2>
 * <h3>
 *     Medium
 * </h3>
 * <p>
 *     In a linked list of size n, where n is even, the ith node (0-indexed) of the linked list is known as the twin of the (n-1-i)th node, if 0 <= i <= (n / 2) - 1.
 * </p>
 * <ul>
 *     <li>For example, if n = 4, then node 0 is the twin of node 3, and node 1 is the twin of node 2. These are the only nodes with twins for n = 4.</li>
 * </ul>
 * <p>
 *     The twin sum is defined as the sum of a node and its twin.
 * </p>
 * <p>
 *     Given the head of a linked list with even length, return the maximum twin sum of the linked list.
 * </p>
 */
public class MaximumTwinSumOfALinkedList {

    ReverseLinkedList reverseLinkedList = new ReverseLinkedList();

    public int solution(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        while (Objects.nonNull(fast.next) && Objects.nonNull(fast.next.next)) {
            fast = fast.next.next;
            slow = slow.next;
        }

        ListNode reversed = this.reverseLinkedList.solution(slow.next);
        int max = Integer.MIN_VALUE;
        ListNode reversedCur = reversed;
        ListNode headCur = head;
        while (Objects.nonNull(reversedCur)) {
            max = Math.max(reversedCur.val + headCur.val, max);
            reversedCur = reversedCur.next;
            headCur = headCur.next;
        }

        return max;
    }
}
