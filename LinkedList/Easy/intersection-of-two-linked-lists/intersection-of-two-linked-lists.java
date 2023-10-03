/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode ptrA = headA, ptrB = headB;
        while(ptrA != ptrB) {
            ptrA = ptrA == null ? headB : ptrA.next;
            ptrB = ptrB == null ? headA : ptrB.next;
        }
        return ptrA;
        /*ArrayList<ListNode> nodesA = new ArrayList<ListNode>();
        ArrayList<ListNode> nodesB = new ArrayList<ListNode>();
        ListNode tempA = headA, tempB = headB;
        while(tempA != null || tempB != null) {
            if(tempA != null) {
                nodesA.add(tempA);
                tempA = tempA.next;
            }
            if(tempB != null) {
                nodesB.add(tempB);
                tempB = tempB.next;
            }
        }
        for(ListNode itr : nodesA) {
            if(nodesB.contains(itr))
                return nodesB.get(nodesB.indexOf(itr));
        }
        return null;*/
    }
}