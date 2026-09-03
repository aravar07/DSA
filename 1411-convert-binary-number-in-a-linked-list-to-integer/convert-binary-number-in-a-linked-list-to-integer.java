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
    public ListNode reverse(ListNode head){
        ListNode curr = head;
        ListNode prev = null;
        ListNode fwd = null;
        while(curr!=null){
            fwd = curr.next;
            curr.next = prev;
            prev = curr;
            curr = fwd;
        }
        return prev;
    }
    public int getDecimalValue(ListNode head) {
        ListNode newHead = reverse(head);
        ListNode temp = newHead;
        int ans = 0;
        int i=0;
        while(temp!=null){
            ans+=temp.val * Math.pow(2,i);
            temp=temp.next;
            i++;
        }
        return ans;
    }
}