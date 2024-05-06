package io.github.matthewjaywong.java.questions.may2024;

import io.github.matthewjaywong.java.common.ListNode;

import java.util.Objects;
import java.util.Stack;

public class RemoveNodesFromLinkedList {
    public ListNode solution(ListNode head) {
        Stack<ListNode> reversed = new Stack<>();
        ListNode cur = head;
        while (Objects.nonNull(cur)) {
            reversed.push(cur);
            cur = cur.next;
        }

        Stack<ListNode> filtered = new Stack<>();
        int max = Integer.MIN_VALUE;
        while (!reversed.isEmpty()) {
            ListNode last = reversed.pop();
            max = Math.max(max, last.val);
            if (last.val >= max)
                filtered.add(last);
        }

        ListNode res = filtered.pop();
        cur = res;
        while (!filtered.isEmpty()) {
            ListNode last = filtered.pop();
            cur.next = last;
            cur = last;
        }

        return res;
    }
}
