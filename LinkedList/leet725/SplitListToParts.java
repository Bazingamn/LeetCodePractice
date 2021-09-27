package LinkedList.leet725;

/**
 * 给你一个头结点为 head 的单链表和一个整数 k ，请你设计一个算法将链表分隔为 k 个连续的部分。
 *
 * 每部分的长度应该尽可能的相等：任意两部分的长度差距不能超过 1 。这可能会导致有些部分为 null 。
 *
 * 这 k 个部分应该按照在链表中出现的顺序排列，并且排在前面的部分的长度应该大于或等于排在后面的长度。
 *
 * 返回一个由上述 k 部分组成的数组。
 *
 */
public class SplitListToParts {

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
 * 拆分链表
 *
 * 分隔链表时，从链表的头结点开始遍历，记当前结点为curr，对于每个部分，进行如下操作：
 * 1、将curr 作为当前部分的头结点；
 * 2、计算当前部分的长度partSize；
 * 3、将向后移动partSize步，则curr为当前部分的尾结点；
 * 4、当curr到达当前部分的尾结点时，需要拆分curr和后面一个结点之间的连接关系，在拆分之前需要存储curr的后一个结点next；
 * 5、令curr的next 指针指向null，完成curr和next的拆分；
 * 6、将next赋值给curr。
 *
 * 完成上述操作之后，即得到分隔链表后的一个部分。重复上述操作，直到分隔出 kk 个部分，或者链表遍历结束，即curr指向null。
 *
 */
class Solution {
    public ListNode[] splitListToParts(ListNode head, int k) {
        int n = 0;
        ListNode temp = head;
        //遍历计算原始链表的长度
        while (temp != null){
            n++;
            temp = temp.next;
        }

        int quotient = n / k;
        int remainder = n % k;

        ListNode[] parts = new ListNode[k];
        ListNode curr = head;

    }
}