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
        if (head == null || head.next == null || k == 0)
            return head;
        int n = 0;
        ListNode temp = head;
        while (temp != null) {
            n++;
            temp = temp.next;
        }

        k %= n;
        if (k == 0)
            return head;

        ListNode trev = reverse(head, null, null);
        int i = k - 1;
        ListNode trev1 = trev;
        while (i > 0) {
            trev1 = trev1.next;
            i--;
        }
        ListNode next2 = trev1.next;
        trev1.next=null;
        ListNode answer = reverse(trev, null, null);
        ListNode second = reverse(next2, null, null);
        ListNode ans = answer;
        while (ans.next != null) {
            ans = ans.next;
        }
        ans.next = second;
        return answer;

    }

    public ListNode reverse(ListNode head, ListNode prev, ListNode last) {
        ListNode curr = head;
        while (curr != last) {
            ListNode next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }
}