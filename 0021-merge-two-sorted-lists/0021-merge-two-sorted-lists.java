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
        ListNode list3 = new ListNode();
        ListNode dummy = list3;
        while(list1!=null && list2!=null){
            if(list1.val < list2.val){
                dummy.next = list1;
                dummy = dummy.next;
                list1 = list1.next;
            }else{
                dummy.next = list2;
                dummy = dummy.next;
                list2 = list2.next;
            }
        }
      dummy.next = (list1!=null) ? list1 : list2;
        return list3.next;
    }
}