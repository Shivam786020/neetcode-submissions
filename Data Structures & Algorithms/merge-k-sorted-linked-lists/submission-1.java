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

public class Solution {
    public ListNode mergeKLists(ListNode[] lists) {
        ListNode dummy = new ListNode(0);
        ListNode cur = dummy;

        while (true) {
            int minIndex = -1;

            for (int i = 0; i < lists.length; i++) {
                if (lists[i] == null) continue;
                if (minIndex == -1 || lists[minIndex].val > lists[i].val) {
                    minIndex = i;
                }
            }

            if (minIndex == -1) break;

            cur.next = lists[minIndex];
            lists[minIndex] = lists[minIndex].next;
            cur = cur.next;
        }

        cur.next = null;

        return dummy.next;
    }
}