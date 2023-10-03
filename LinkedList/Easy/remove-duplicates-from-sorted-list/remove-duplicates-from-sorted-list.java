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
    public ListNode deleteDuplicates(ListNode head) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        ListNode temp = head;
        ListNode prev = null;
        while(temp != null) {
            if(list.contains(temp.val)) {
                prev.next = temp.next;
                temp = null;
                temp = prev.next;
            }
            else {
                list.add(temp.val);
                System.out.println(temp.val);
                prev = temp;
                temp = temp.next;
            }
        }
        return head;
    }
}