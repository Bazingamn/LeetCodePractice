package offer06;

import java.util.Deque;
import java.util.LinkedList;

public class ReversePrintList {
    public static void main(String[] args) {
        ListNode head1 = new ListNode(1);
        ListNode head2 = new ListNode(2);
        ListNode head3 = new ListNode(3);
        head1.next = head2;
        head2.next = head3;
        int[] result = new Solution().reversePrint(head1);
        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i]);
        }
    }
}


//Definition for singly-linked list
class ListNode {
    int val;
    ListNode next;
    ListNode(int x) {
        val = x;
    }
}

class Solution {
    /**
     * 解法一、使用辅助栈
     * @param head
     * @return
     */
    public int[] reversePrint(ListNode head) {
        Deque<Integer> astack = new LinkedList<Integer>();
        while (head != null){
            astack.push(head.val);
            head = head.next;
        }
        int len = astack.size();
        int[] result = new int[len];
        for (int i = 0; i < len; i++) {
            result[i] = astack.pop();
        }
        return result;
    }
}