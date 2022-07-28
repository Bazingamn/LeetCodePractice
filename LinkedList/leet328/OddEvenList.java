package LinkedList.leet328;

/**
 * 给定一个单链表，把所有的奇数节点和偶数节点分别排在一起。请注意，这里的奇数节点和偶数节点指的是节点编号的奇偶性，而不是节点的值的奇偶性。
 *
 * 请尝试使用原地算法完成。你的算法的空间复杂度应为 O(1)，时间复杂度应为 O(nodes)，nodes 为节点总数。
 *
 * 输入: 1->2->3->4->5->NULL
 * 输出: 1->3->5->2->4->NULL
 *
 * 输入: 2->1->3->5->6->4->7->NULL
 * 输出: 2->3->6->7->1->5->4->NULL
 *
 * unfinished
 */
public class OddEvenList {
    public static void main(String[] args) {

    }
}


class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) {
        this.val = val;
    }
    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}


class Solution {
    public ListNode oddEvenList(ListNode head) {
        if (head == null){
            return null;
        }
        //偶数链表的头节点
        ListNode evenHead = head.next;

        ListNode odd = head;
        ListNode even = evenHead;

        while (even != null && even.next != null){
            return null;
        }
        return null;
    }
}