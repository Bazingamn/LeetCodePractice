package nc78;

import java.util.Stack;

/**
 * 输入一个链表，反转链表后，输出新链表的表头。
 * 输入：
 * {1,2,3}
 * 返回值：
 * {3,2,1}
 */
public class ReverseList {
    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next.val = 2;
        head.next.next.val = 3;
        ListNode t = new Solution().Reverse(head);
        System.out.println(t);
    }
}

class ListNode {
    int val;
    ListNode next = null;

    ListNode(int val) {
        this.val = val;
    }
}
class Solution {
    public ListNode Reverse(ListNode head) {
        //创建一个栈
        Stack<ListNode> stack = new Stack<>();

        //将链表中所有元素压入栈中
        while (head != null){
            stack.push(head);
            head = head.next;
        }
        if (stack.isEmpty()){
            return null;
        }
        ListNode node = stack.pop();
        ListNode dummy = node;
        //栈中结点全部出栈
        while (!stack.isEmpty()){
            ListNode tempNode = stack.pop();
            node.next = tempNode;
            node = node.next;
        }
        //最后一个结点即为反转前的头结点，它的next必须为null，否则会构成环
        node.next = null;
        return dummy;
    }
}