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

  public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
    ListNode mergedList = null, returnHead = null;
    ListNode temp1 = list1;
    ListNode temp2 = list2;
    while (temp1 != null || temp2 != null) {
      if (mergedList == null) {
        if (temp1 != null && temp2 != null) {
          if (temp1.val <= temp2.val) {
            mergedList = new ListNode(temp1.val);
            returnHead = mergedList;
            temp1 = temp1.next;
          } else {
            mergedList = new ListNode(temp2.val);
            returnHead = mergedList;
            temp2 = temp2.next;
          }
        } else if (temp1 != null) {
          mergedList = temp1;
          returnHead = mergedList;
          break;
        } else if (temp2 != null) {
          mergedList = temp2;
          returnHead = mergedList;
          break;
        }
      } else {
        if (temp1 != null && temp2 != null) {
          if (temp1.val < temp2.val) {
            mergedList.next = new ListNode(temp1.val);
            mergedList = mergedList.next;
            temp1 = temp1.next;
          } else {
            mergedList.next = new ListNode(temp2.val);
            mergedList = mergedList.next;
            temp2 = temp2.next;
          }
        } else if (temp1 != null) {
          mergedList.next = temp1;
          break;
        } else if (temp2 != null) {
          mergedList.next = temp2;
          break;
        }
      }
    }
    return returnHead;
  }
}
