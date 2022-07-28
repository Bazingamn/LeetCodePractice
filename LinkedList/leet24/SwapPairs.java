package LinkedList.leet24;

/**
 * 给定一个链表，两两交换其中相邻的节点，并返回交换后的链表。
 *
 * 你不能只是单纯的改变节点内部的值，而是需要实际的进行节点交换。
 *
 * 输入：head = [1,2,3,4]
 * 输出：[2,1,4,3]
 *
 * 输入：head = []
 * 输出：[]
 *
 * 输入：head = [1]
 * 输出：[1]
 */
public class SwapPairs {

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


/**
 * 递归
 * 递归的终止条件是链表中没有节点，或者链表中只有一个节点，此时无法进行交换。
 */
class Solution1 {
    public ListNode swapPairs(ListNode head) {
        //如果原始链表为空或只有一个节点，返回原链表
        if (head == null || head.next == null){
            return head;
        }
        //head表示原始链表的头节点；newhead表示新链表的头节点,即原始链表头节点的下一个节点
        ListNode newhead = head.next;
        //其余两节点进行两两交换
        head.next = swapPairs(newhead.next);
        newhead.next = head;
        return newhead;
    }
}


/**
 * 迭代法
 */
class Solution2 {
    public ListNode swapPairs(ListNode head) {
        ListNode dummyHead = new ListNode(0);
        dummyHead.next = head;
        ListNode temp = dummyHead;
        while (temp.next != null && temp.next.next != null){
            ListNode node1 = temp.next;
            ListNode node2 = temp.next.next;
            temp.next = node2;
            node1.next = node2.next;
            node2.next = node1;
            temp = node1;
        }
        return dummyHead.next;
    }
}
