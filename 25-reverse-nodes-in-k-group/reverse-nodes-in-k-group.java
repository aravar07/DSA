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
            fwd=curr.next;
            curr.next=prev;
            prev = curr;
            curr = fwd;
        }
        return prev;
    }
    public ListNode reverseKGroup(ListNode head, int k) {
        ListNode groupStart = head;
        ListNode temp = head;
        ListNode resultHead = null;
        ListNode prevTail=null;
        while(temp!=null){
            for(int i=1;i<k;i++){
                if(temp.next==null){
                    return resultHead == null ? head:resultHead;
                }
                temp = temp.next;
            }
            ListNode nextGroup = temp.next;
            temp.next=null;
            ListNode newHead = reverse(groupStart);
            if(resultHead==null){
                resultHead = newHead;
            }
            if(prevTail!=null){
                prevTail.next=newHead;
            }
            groupStart.next = nextGroup;
            prevTail=groupStart;
            groupStart = nextGroup;
            temp = nextGroup;  
        }
        
        return resultHead;
    }
}