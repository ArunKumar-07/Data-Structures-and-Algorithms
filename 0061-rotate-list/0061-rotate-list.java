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
    public ListNode rotateRight(ListNode head, int k) {
        if(k <=0 || head == null || head.next==null) return head;
        int count = 1;
        ListNode curr = head;
        while(curr.next != null){
            curr = curr.next;
            count++;
        }
        curr.next = head;
        int len = k % count;
        int skip = count - len;
        ListNode first = head;
         for(int i=0;i<skip-1;i++){
             first = first.next;
         }                                              
         head = first.next;
          first.next= null;              
        return head;
        
    }
}