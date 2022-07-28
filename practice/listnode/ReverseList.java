package practice.listnode;

public class ReverseList {
    /**
     * 递归反转整个链表
     * reverse函数定义：输入一个节点 head，将「以 head 为起点」的链表反转，并返回反转之后的头结点。
     */
    ListNode reverse(ListNode head){
        //如果链表只有一个节点的时候反转也是它自己，直接返回即可
        if (head.next == null)
            return head;
        ListNode last = reverse(head.next);
        head.next.next = head;
        head.next = null;//当链表递归反转之后，新的头结点是 last，而之前的 head 变成了最后一个节点，别忘了链表的末尾要指向 null：
        return last;
    }

    /**
     * 递归反转链表的前n个节点
     */
    ListNode successor = null;  //后驱节点
    ListNode reverseN(ListNode head, int n){
        //反转以head为起点的n个节点，返回新的头节点
        if (n == 1){
            //记录第n+1个节点
            successor = head.next;
            return head;
        }
        //以head.next为起点，反转前n-1个节点
        ListNode last = reverseN(head.next, n-1);
        head.next.next = head;
        //让反转之后的head节点和后面的节点连起来
        head.next = successor;
        return last;
    }
}

/**
 * 单链表节点结构
 */
class ListNode{
    int val;
    ListNode next;
    ListNode(int x){
        val = x;
    }
}

