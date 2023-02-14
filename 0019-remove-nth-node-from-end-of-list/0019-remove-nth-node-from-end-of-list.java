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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        int number=total(head);
         if(number==n){
             return head.next;
         }
        ListNode curr=head;
        int remove =number-n-1;
        for( int i=0; curr!=null && i<remove;i++){
            curr=curr.next;
        }
        curr.next=curr.next.next;
        return head;
        
    }
    int total(ListNode head){
        int count=0;
        ListNode value=head;
        while(value!=null){
            value=value.next;
            count++;
        }
        return count;
    }
}