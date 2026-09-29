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
    public boolean hasCycle(ListNode head) {
        if(head == null ){
            return false;
        }
       
        HashSet<ListNode> seen = new HashSet<>();
        ListNode cur = head;
        while(cur != null){
            if(seen.contains(cur)){
                return true;
            }
            seen.add(cur);
            cur = cur.next;
        }
return false;
        
        
    }
}
