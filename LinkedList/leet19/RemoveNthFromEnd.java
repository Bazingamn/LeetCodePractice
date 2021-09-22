package LinkedList.leet19;

import java.util.Deque;
import java.util.LinkedList;

/**
 * 给你一个链表，删除链表的倒数第 n 个结点，并且返回链表的头结点。
 *
 * 进阶：你能尝试使用一趟扫描实现吗？
 */
public class RemoveNthFromEnd {
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
        this.val = val; this.next = next;
    }
}


/**
 * 法一：计算链表长度
 */
class Solution1 {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode dummy = new ListNode(0, head);
        int length = getLength(head);
        ListNode cur = dummy;
        for (int i = 1; i < length - n + 1; ++i){
            cur = cur.next;
        }
        cur.next = cur.next.next;//删除第n个节点
        ListNode ans = dummy.next;
        return ans;
    }

    public int getLength(ListNode head){
        int length = 0;
        while (head != null){
            length++;
            head = head.next;
        }
        return length;
    }
}


/**
 * 法二：栈
 */
class Solution2 {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode dummy = new ListNode(0, head);
        Deque<ListNode> stack = new LinkedList<ListNode>();
        ListNode cur = dummy;
        while (cur != null){
            stack.push(cur);
            cur = cur.next;
        }
        for (int i = 0; i < n; i++){
            stack.pop();
        }
        ListNode prev = stack.peek();
        prev.next = prev.next.next;
        ListNode ans = dummy.next;
        return ans;
    }
}


/**
 * 法三：快慢指针
 * 使用两个指针first、second同时对链表进行遍历，并且first比second超前n个节点，
 * 当first遍历到末尾时，second恰好处于倒数第n个节点。
 */
class Solution3 {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        //原先链表头节点从1开始，为了方便后面的操作，定义一个哑节点dummy，dummy的next指向head。
        ListNode dummy = new ListNode(0, head);
        //定义快慢指针first，head；
        ListNode first = head;
        ListNode second = dummy;
        //first先遍历n个节点
        for (int i = 0; i < n; i++) {
            first = first.next;
        }
        //然后first和second同时开始遍历，当first指向null时，遍历结束
        while (first != null){
            first = first.next;
            second = second.next;
        }
        //second已经遍历到了n-1个节点，可以删除第n个节点
        second.next = second.next.next;
        ListNode ans = dummy.next;
        return ans;
    }
}