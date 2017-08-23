package com.leetcode;

/**
 * Created by Chen on 2015/4/22.
 *
 https://leetcode.com/problems/add-two-numbers/

 You are given two linked lists representing two non-negative numbers.
 The digits are stored in reverse order and each of their nodes contain a single digit.
 Add the two numbers and return it as a linked list.

 Input: (2 -> 4 -> 3) + (5 -> 6 -> 9)
 Output: 7 -> 0 -> 2 -> 1

 *
 *
 *
 */
public class AddTwoNumbers {

    public static void main(String[] args) {
        AddTwoNumbers.ListNode l1 = new AddTwoNumbers.ListNode(2);
        l1.next = new AddTwoNumbers.ListNode(4);
        l1.next.next = new AddTwoNumbers.ListNode(3);

        AddTwoNumbers.ListNode l2 = new AddTwoNumbers.ListNode(5);
        l2.next = new AddTwoNumbers.ListNode(6);
        l2.next = new AddTwoNumbers.ListNode(9);

        AddTwoNumbers object = new AddTwoNumbers();
        AddTwoNumbers.ListNode resultNode = object.addTwoNumbers(l1, l2);

        object.print(resultNode);
    }

    static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        // Initialize current node to dummy head of the returning list
        ListNode head = new ListNode(-1);
        ListNode current = head;

        // Initialize carry to 0
        int carry = 0;

        while (l1 != null || l2 != null) {
            // Set v1 to node l1's value. If l1 has reached the end of l1, set to 0
            int v1 = (l1 == null) ? 0 : l1.val;
            int v2 = (l2 == null) ? 0 : l2.val;

            int sum = v1 + v2 + carry;
            carry = sum / 10; // update carry

            // create a new note with value of sum%10 and set it to current note's next
            current.next = new ListNode(sum % 10);
            // move the current note to next
            current = current.next;

            // Move l1 and l2
            l1 = (l1 == null) ? null : l1.next;
            l2 = (l2 == null) ? null : l2.next;
        }

        // Check if carry>0, if so append a new node with digit 1 to the returning list
        if (carry > 0) {
            current.next = new ListNode(1);
        }

        return head.next;
    }

    public void print(ListNode listNode) {
        while (listNode != null) {
            System.out.println(listNode.val);
            listNode = listNode.next;
        }
    }

}
