/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */

class Solution {
    public void reorderList(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;

        while (fast.next != null && fast.next.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }

        ListNode secondHalf = slow.next;
        slow.next = null;

        ListNode prev = null;

        while (secondHalf != null) {
            ListNode nextNode = secondHalf.next;
            secondHalf.next = prev;
            prev = secondHalf;
            secondHalf = nextNode;
        }

        secondHalf = prev;

        ListNode firstHalf = head;

        while (secondHalf != null) {
            ListNode firstNext = firstHalf.next;
            ListNode secondNext = secondHalf.next;

            firstHalf.next = secondHalf;
            secondHalf.next = firstNext;

            firstHalf = firstNext;
            secondHalf = secondNext;
        }
    }
}
