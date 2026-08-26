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
    public ListNode insertionSortList(ListNode head) {
        ListNode temp=head;
        ListNode dummy=new ListNode();
        while(temp!=null){
            ListNode ptr=dummy;
            while(ptr.next!=null&&ptr.next.val<temp.val){
                ptr=ptr.next;

            }
            ListNode key=temp.next;
            temp.next=ptr.next;
            ptr.next=temp;
            temp=key;
        }
        return dummy.next;
    }
}