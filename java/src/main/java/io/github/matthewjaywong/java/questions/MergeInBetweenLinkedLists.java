package io.github.matthewjaywong.java.questions;

import io.github.matthewjaywong.java.common.ListNode;

import java.util.Objects;

/**
 * <h1>
 *     <a href="https://leetcode.com/problems/merge-in-between-linked-lists/description/">1669. Merge In Between Linked Lists</a>
 * </h1>
 * <h2>
 *     Problem of the Day: 20-03-2024
 * </h2>
 * <h3>
 *     Easy
 * </h3>
 * <p>
 *     You are given two linked lists: list1 and list2 of sizes n and m respectively.
 * </p>
 * <p>
 *     Remove list1's nodes from the ath node to the bth node, and put list2 in their place.
 * </p>
 * <p>
 *     The blue edges and nodes in the following figure indicate the result:
 * </p>
 * <img src="https://assets.leetcode.com/uploads/2020/11/05/fig1.png" />
 * <p>
 *     Build the result list and return its head.
 * </p>
 */
public class MergeInBetweenLinkedLists {
    public ListNode solution(ListNode list1, int a, int b, ListNode list2) {
        ListNode list2Tail = list2;
        while(Objects.nonNull(list2Tail.next))
            list2Tail = list2Tail.next;

        ListNode list1RemoveOnwards = list1;
        for (int i = 0; i < a - 1; i++)
            list1RemoveOnwards = list1RemoveOnwards.next;

        ListNode list1RemoveUpTo = list1RemoveOnwards;
        for (int i = a; i < b - 1; i++)
            list1RemoveUpTo = list1RemoveUpTo.next;

        list1RemoveOnwards.next = list2;
        list2Tail.next = list1RemoveUpTo;

        return list1;
    }
}
