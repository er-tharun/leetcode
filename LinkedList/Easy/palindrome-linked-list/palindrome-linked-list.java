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
    public boolean isPalindrome(ListNode head) {
        ListNode slowPtr = head, fastPtr = head;
        while(fastPtr != null && fastPtr.next != null) {
            fastPtr = fastPtr.next.next;
            slowPtr = slowPtr.next;
        }

        ListNode currentNode = slowPtr, prev = null;
        while(currentNode != null) {
            ListNode next = currentNode.next;

            currentNode.next = prev;

            prev = currentNode;

            currentNode = next;

        }

        ListNode temp = head;
        while(temp != null && temp.next != null && prev != null) {
            if(temp.val == prev.val) {
                temp = temp.next;
                prev = prev.next;
            }
            else
                return false;
        }
        return true;

    }
}