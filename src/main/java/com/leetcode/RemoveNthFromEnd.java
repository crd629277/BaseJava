package com.leetcode;

/**
 * Created by chenwinfred on 6/27/15.
 */

class ListNode {
    int val;
    ListNode next;
    ListNode(int x) {
        val = x;
    }
}

public class RemoveNthFromEnd {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode start = new ListNode(0);

        ListNode slow = start;
        ListNode fast = start;
        start.next = head;

        while (n > 0 && fast.next != null) {
            fast = fast.next;
            n--;
        }

        while (fast.next != null) {
            slow = slow.next;
            fast = fast.next;
        }

        slow.next = slow.next.next;

        return start.next;
    }

}
