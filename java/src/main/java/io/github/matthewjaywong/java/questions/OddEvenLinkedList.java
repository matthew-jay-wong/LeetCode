package io.github.matthewjaywong.java.questions;

import io.github.matthewjaywong.java.common.ListNode;

import java.util.Objects;

/**
 * <h1>
 *     <a href="https://leetcode.com/problems/odd-even-linked-list/description/">328. Odd Even Linked List</a>
 * </h1>
 * <h2>
 *     LeetCode 75
 * </h2>
 * <h3>
 *     Medium
 * </h3>
 * <p>
 *     Given the head of a singly linked list, group all the nodes with odd indices together followed by the nodes with even indices, and return the reordered list.
 * </p>
 * <p>
 *     The first node is considered odd, and the second node is even, and so on.
 * </p>
 * <p>
 *     Note that the relative order inside both the even and odd groups should remain as it was in the input.
 * </p>
 * <p>
 *     You must solve the problem in O(1) extra space complexity and O(n) time complexity.
 * </p>
 */
public class OddEvenLinkedList {
    public ListNode solution(ListNode head) {
        if (Objects.isNull(head) || Objects.isNull(head.next))
            return head;

        ListNode odd = head;
        ListNode even = head.next;
        ListNode tempEvenHead = even;

        while (Objects.nonNull(odd.next) && Objects.nonNull(odd.next.next)) {
            ListNode oddNext = odd.next.next;
            ListNode evenNext = even.next.next;
            odd.next = oddNext;
            even.next = evenNext;
            even = even.next;
            odd = odd.next;
        }


        odd.next = tempEvenHead;
        return head;
    }
}
