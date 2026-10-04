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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        // ListNode dummy = new ListNode(0);
        // ListNode node = dummy;

        // while (list1 != null && list2 != null) {
        //     if (list1.val < list2.val) {
        //         node.next = list1;
        //         list1 = list1.next;
        //     } else {
        //         node.next = list2;
        //         list2 = list2.next;
        //     }
        //     node = node.next;
        // }
if(list1 == null) return list2;
if(list2 == null) return list1;

if(list1.val<list2.val){
    list1.next = mergeTwoLists(list1.next,list2);
    return list1;
} else {
list2.next = mergeTwoLists(list2.next,list1);
return list2;
}
        // if (list1 != null) {
        //     node.next = list1;
        // } else {
        //     node.next = list2;
        // }

        // return dummy.next;
    }
}