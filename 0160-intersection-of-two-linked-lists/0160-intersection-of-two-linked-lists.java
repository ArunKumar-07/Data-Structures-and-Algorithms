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
        ListNode first=headA;
        ListNode second=headB;
        while(first!=second){
            first=first==null ? headB : first.next;
            second=second==null ? headA : second.next; 
        }
        return first;
    }
}